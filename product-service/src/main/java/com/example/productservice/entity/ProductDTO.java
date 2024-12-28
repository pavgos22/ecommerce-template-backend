package com.example.productservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
    private String uid;
    private boolean activate;
    private String name;
    private String mainDesc;
    private String descHtml;
    private float price;
    private String[] imageUrls;
    private Map<String, String> parameters;
    private LocalDate createAt;
    private CategoryDTO categoryDTO;

    public ProductDTO(String uid, boolean activate, String name, String mainDesc, String descHtml, float price, String[] imageUrls, Map<String, String> parameters, LocalDate createAt, CategoryDTO categoryDTO) {
        this.uid = uid;
        this.activate = activate;
        this.name = name;
        this.mainDesc = mainDesc;
        this.descHtml = descHtml;
        this.price = price;
        this.imageUrls = imageUrls;
        this.parameters = parameters;
        this.createAt = createAt;
        this.categoryDTO = categoryDTO;
    }
}
