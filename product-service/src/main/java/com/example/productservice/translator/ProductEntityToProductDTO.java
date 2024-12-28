package com.example.productservice.translator;

import com.example.productservice.entity.Category;
import com.example.productservice.entity.CategoryDTO;
import com.example.productservice.entity.ProductDTO;
import com.example.productservice.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityToProductDTO {

    public ProductDTO toProductDTO(ProductEntity productEntity) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setUid(productEntity.getUid());
        productDTO.setActivate(productEntity.isActivate());
        productDTO.setName(productEntity.getName());
        productDTO.setMainDesc(productEntity.getMainDesc());
        productDTO.setDescHtml(productEntity.getDescHtml());
        productDTO.setPrice(productEntity.getPrice());
        productDTO.setImageUrls(productEntity.getImageUrls());
        productDTO.setParameters(productEntity.getParameters());
        productDTO.setCreateAt(productEntity.getCreateAt());

        // Map the Category to CategoryDTO
        productDTO.setCategoryDTO(toCategoryDTO(productEntity.getCategory()));

        return productDTO;
    }

    private CategoryDTO toCategoryDTO(Category category) {
        if (category == null) {
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(category.getName());
        categoryDTO.setShortId(category.getShortId());
        return categoryDTO;
    }
}
