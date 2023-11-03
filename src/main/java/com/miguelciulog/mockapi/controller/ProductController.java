package com.miguelciulog.mockapi.controller;


import com.miguelciulog.mockapi.dto.response.CategoryResponse;
import com.miguelciulog.mockapi.dto.response.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping()
    public ProductResponse error() {
        CategoryResponse v = new CategoryResponse("uwuw","category", "https://picsum.photos/200");
        return new ProductResponse(
            "uwu",
            "title",
            new BigDecimal(150),
            "mxn",
            v,
            "description",
            new String[]{"https://picsum.photos/200", "https://picsum.photos/200"}
        );
    }
}
