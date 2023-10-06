package org.example.mappers;

import javax.annotation.processing.Generated;
import org.example.dto.account.RegisterDTO;
import org.example.entities.UserEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-02T21:10:44+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public UserEntity itemDtoToUser(RegisterDTO registerDTO) {
        if ( registerDTO == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.email( registerDTO.getEmail() );
        userEntity.firstName( registerDTO.getFirstName() );
        userEntity.lastName( registerDTO.getLastName() );
        userEntity.phone( registerDTO.getPhone() );

        return userEntity.build();
    }
}
