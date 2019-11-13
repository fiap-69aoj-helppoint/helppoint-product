package com.helppoint.product.converter;

import com.helppoint.product.dto.ColorResponse;
import com.helppoint.product.dto.ProductResponse;
import com.helppoint.product.dto.SizeResponse;
import com.helppoint.product.entity.ProductEntity;
import com.helppoint.product.entity.ProductSizeEntity;
import com.helppoint.product.entity.SizeColorEntity;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProductConverter {

    private ColorResponse toColorResponse(final SizeColorEntity sizeColorEntity) {
        return ColorResponse.builder()
            .id(sizeColorEntity.getColor().getId())
            .name(sizeColorEntity.getColor().getName())
            .description(sizeColorEntity.getColor().getDescription())
            .amount(sizeColorEntity.getAmount())
            .build();
    }

    private SizeResponse toSizeResponse(final ProductSizeEntity productSizeEntity) {
        return SizeResponse.builder()
            .id(productSizeEntity.getSize().getId())
            .description(productSizeEntity.getSize().getDescription())
            .amount(productSizeEntity.getAmount())
            .colors(
                productSizeEntity.getSize().getProductColor().stream()
                    .map(this::toColorResponse)
                    .collect(Collectors.toList())
            )
            .build();
    }

    public ProductResponse toProductResponse(final ProductEntity productEntity) {
        return ProductResponse.builder()
            .id(productEntity.getId())
            .description(productEntity.getDescription())
            .image(productEntity.getImage())
            .value(productEntity.getValue())
            .sizes(
                productEntity.getProductSize().stream()
                    .map(this::toSizeResponse)
                    .collect(Collectors.toList())
            )
            .build();
    }

}
