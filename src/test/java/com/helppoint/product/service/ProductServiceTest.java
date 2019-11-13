package com.helppoint.product.service;

import com.helppoint.product.entity.ProductEntity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void findById() {
        List<ProductEntity> productEntityList = new ArrayList<>();
        ProductEntity productEntity1 = ProductEntity.builder()
            .id(1L)
            .description("Camiseta Polo")
            .build();
    }
}