package com.miguelciulog.mockapi.dao;

import com.miguelciulog.mockapi.dto.response.CategoryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("product")
public class ProductDAO {
    @Id
    private int id;
    private String title;
    private BigDecimal price;
    private String currencyType;
    private CategoryResponse category;
    private String description;
    private String[] images;

    @DateTimeFormat(pattern="dd-MM-yyyy HH:mm")
    private LocalDateTime createdDate;
}
