package org.example.mappers;

import javax.annotation.processing.Generated;
import org.example.dto.product.ProductItemDTO;
import org.example.entities.CategoryEntity;
import org.example.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-20T17:52:40+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductItemDTO ProductItemDTOByProduct(ProductEntity product) {
        if ( product == null ) {
            return null;
        }

        ProductItemDTO productItemDTO = new ProductItemDTO();

        productItemDTO.setCategory( productCategoryName( product ) );
        productItemDTO.setCategory_id( productCategoryId( product ) );
        productItemDTO.setDescription( product.getDescription() );
        productItemDTO.setId( product.getId() );
        productItemDTO.setName( product.getName() );
        productItemDTO.setPrice( product.getPrice() );

        return productItemDTO;
    }

    private String productCategoryName(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }
        CategoryEntity category = productEntity.getCategory();
        if ( category == null ) {
            return null;
        }
        String name = category.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private int productCategoryId(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return 0;
        }
        CategoryEntity category = productEntity.getCategory();
        if ( category == null ) {
            return 0;
        }
        int id = category.getId();
        return id;
    }
}
