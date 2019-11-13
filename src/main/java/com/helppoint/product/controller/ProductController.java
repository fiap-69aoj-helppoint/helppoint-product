package com.helppoint.product.controller;

import com.helppoint.product.dto.ProductResponse;
import com.helppoint.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@Api(value = "Produtos", tags = {"API de Produtos"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "Busca um produto por id")
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable final Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }

}
