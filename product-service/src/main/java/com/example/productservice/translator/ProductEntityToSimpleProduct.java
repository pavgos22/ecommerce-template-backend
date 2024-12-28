package com.example.productservice.translator;

import com.example.productservice.entity.ProductEntity;
import com.example.productservice.entity.SimpleProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityToSimpleProduct {

    public SimpleProductDTO toSimpleProduct(ProductEntity productEntity) {
        SimpleProductDTO dto = new SimpleProductDTO();
        dto.setName(productEntity.getName());
        dto.setMainDesc(productEntity.getMainDesc());
        dto.setPrice(productEntity.getPrice());
        dto.setCreateAt(productEntity.getCreateAt());
        dto.setImageUrl(getImageUrl(productEntity.getImageUrls()));
        return dto;
    }

    private String getImageUrl(String[] images) {
        return images != null && images.length >= 1 ? images[0] : null;
    }
}