package com.miguelciulog.mockapi.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponse {
    final private String id;
    final private String title;
    final private BigDecimal price;
    final private String currencyType;
    final private CategoryResponse category;
    final private String description;
    final private String[] images;
}
