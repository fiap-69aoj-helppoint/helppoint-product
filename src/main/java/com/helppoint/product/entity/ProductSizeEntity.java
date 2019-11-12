package com.helppoint.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_size")
public class ProductSizeEntity implements Serializable {

    private static final long serialVersionUID = 5741301628693050272L;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_product")
    private ProductEntity product;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_size")
    private SizeEntity size;

    @NotNull
    private Integer amount;

}
