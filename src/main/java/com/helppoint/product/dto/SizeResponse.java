package com.helppoint.product.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
public class SizeResponse implements Serializable {

    private static final long serialVersionUID = -4226907876469721232L;

    private final Long id;
    private final String description;

}
