package com.helppoint.product.service;

import com.helppoint.product.converter.ProductConverter;
import com.helppoint.product.dto.ProductResponse;
import com.helppoint.product.entity.ProductEntity;
import com.helppoint.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;

    public ProductResponse findById(final Long id) {
        // todo lancar exception
        final ProductEntity productEntity = productRepository.findById(id).orElse(null);

        log.info(String.valueOf(productEntity));

        return productConverter.toProductResponse(productEntity);
    }

}
