package com.helppoint.product.converter;

import com.helppoint.product.dto.ColorResponse;
import com.helppoint.product.dto.ProductResponse;
import com.helppoint.product.dto.SizeResponse;
import com.helppoint.product.entity.ColorEntity;
import com.helppoint.product.entity.ProductEntity;
import com.helppoint.product.entity.SizeEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter {

    private ColorResponse toColorResponse(final ColorEntity colorEntity) {
        return ColorResponse.builder()
            .id(colorEntity.getId())
            .description(colorEntity.getDescription())
            .build();
    }

    private SizeResponse toSizeResponse(final SizeEntity sizeEntity) {
        return SizeResponse.builder()
            .id(sizeEntity.getId())
            .description(sizeEntity.getDescription())
            .build();
    }

    public ProductResponse toProductResponse(final ProductEntity productEntity) {
        return ProductResponse.builder()
            .id(productEntity.getId())
            .description(productEntity.getDescription())
            .image(productEntity.getImage())
            .amount(productEntity.getAmount())
            .colors(
                productEntity.getColors().stream()
                    .map(this::toColorResponse)
                    .collect(Collectors.toList()
                )
            )
            .sizes(
                productEntity.getSizes().stream()
                    .map(this::toSizeResponse)
                    .collect(Collectors.toList()
                )
            )
            .build();
    }

}
