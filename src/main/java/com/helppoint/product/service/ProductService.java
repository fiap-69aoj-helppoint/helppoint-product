package com.helppoint.product.service;

import com.helppoint.product.converter.ProductConverter;
import com.helppoint.product.dto.ProductResponse;
import com.helppoint.product.entity.ProductEntity;
import com.helppoint.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;

    public ProductResponse findById(final Long id) throws Exception {
        final ProductEntity productEntity = productRepository.findById(id).orElseThrow(Exception::new);
        return productConverter.toProductResponse(productEntity);
    }

    public List<ProductResponse> related(final Long id) throws Exception {
        final List<ProductResponse> relatedList = new ArrayList<>();
        if (id == 1) {
            relatedList.add(findById(2L));
            relatedList.add(findById(3L));
        }

        if (id == 2) {
            relatedList.add(findById(1L));
            relatedList.add(findById(3L));
        }

        if (id == 3) {
            relatedList.add(findById(1L));
            relatedList.add(findById(2L));
        }

        return relatedList;
    }

}
