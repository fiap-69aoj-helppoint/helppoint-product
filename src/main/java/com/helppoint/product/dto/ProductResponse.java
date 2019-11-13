package com.helppoint.product.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Builder
@Getter
public class ProductResponse implements Serializable {

    private static final long serialVersionUID = 2197007163880748884L;

    private final Long id;
    private final String description;
    private final String image;
    private final BigDecimal value;
    private final List<SizeResponse> sizes;

}
