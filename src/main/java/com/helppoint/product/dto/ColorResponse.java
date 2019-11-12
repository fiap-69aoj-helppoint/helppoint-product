package com.helppoint.product.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
public class ColorResponse implements Serializable {

    private static final long serialVersionUID = 9122132747800877104L;

    private final Long id;
    private final String name;
    private final String description;
    private final Integer amount;

}
