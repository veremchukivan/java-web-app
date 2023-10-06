package org.example.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.dto.category.CategoryCreateDTO;
import org.example.dto.category.CategoryItemDTO;
import org.example.dto.category.CategoryUpdateDTO;
import org.example.entities.CategoryEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-02T21:10:45+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryItemDTO categoryToItemDTO(CategoryEntity category) {
        if ( category == null ) {
            return null;
        }

        CategoryItemDTO categoryItemDTO = new CategoryItemDTO();

        categoryItemDTO.setDescription( category.getDescription() );
        categoryItemDTO.setId( category.getId() );
        categoryItemDTO.setImage( category.getImage() );
        categoryItemDTO.setName( category.getName() );

        return categoryItemDTO;
    }

    @Override
    public List<CategoryItemDTO> listCategoriesToItemDTO(List<CategoryEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CategoryItemDTO> list1 = new ArrayList<CategoryItemDTO>( list.size() );
        for ( CategoryEntity categoryEntity : list ) {
            list1.add( categoryToItemDTO( categoryEntity ) );
        }

        return list1;
    }

    @Override
    public CategoryEntity categoryByCreateCategoryDTO(CategoryCreateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CategoryEntity.CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.description( dto.getDescription() );
        categoryEntity.name( dto.getName() );

        return categoryEntity.build();
    }

    @Override
    public CategoryEntity categoryByUpdateCategoryDTO(CategoryUpdateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CategoryEntity.CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.description( dto.getDescription() );
        categoryEntity.name( dto.getName() );

        return categoryEntity.build();
    }
}
