package org.example.mappers;

import javax.annotation.processing.Generated;
import org.example.dto.productimage.ProductImageDTO;
import org.example.entities.ProductEntity;
import org.example.entities.ProductImageEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-20T17:52:39+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class ProductImageMapperImpl implements ProductImageMapper {

    @Override
    public ProductImageDTO productImageToItemDTO(ProductImageEntity productImage) {
        if ( productImage == null ) {
            return null;
        }

        ProductImageDTO productImageDTO = new ProductImageDTO();

        productImageDTO.setProductId( productImageProductId( productImage ) );
        productImageDTO.setId( productImage.getId() );

        return productImageDTO;
    }

    private int productImageProductId(ProductImageEntity productImageEntity) {
        if ( productImageEntity == null ) {
            return 0;
        }
        ProductEntity product = productImageEntity.getProduct();
        if ( product == null ) {
            return 0;
        }
        int id = product.getId();
        return id;
    }
}
