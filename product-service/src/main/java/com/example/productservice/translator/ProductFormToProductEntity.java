package com.example.productservice.translator;

import com.example.productservice.entity.Category;
import com.example.productservice.entity.ProductEntity;
import com.example.productservice.entity.ProductFormDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProductFormToProductEntity {

    public ProductEntity toProductEntity(ProductFormDTO productFormDTO) throws JsonProcessingException {
        ProductEntity productEntity = new ProductEntity();
        ObjectMapper objectMapper = new ObjectMapper();

        productEntity.setName(productFormDTO.getName());
        productEntity.setMainDesc(productFormDTO.getMainDesc());
        productEntity.setDescHtml(productFormDTO.getDescHtml());
        productEntity.setPrice(productFormDTO.getPrice());
        productEntity.setParameters(objectMapper.readValue(productFormDTO.getParameters(), new TypeReference<Map<String, String>>() {}));


        productEntity.setImageUrls(productFormDTO.getImagesUuid());

        productEntity.setCategory(translateCategory(productFormDTO.getCategory()));

        return productEntity;
    }

    private Category translateCategory(String uuid) {
        Category category = new Category();
        category.setShortId(uuid);
        return category;
    }
}
