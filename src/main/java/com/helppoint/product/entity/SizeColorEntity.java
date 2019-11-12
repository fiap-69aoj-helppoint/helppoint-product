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
@Table(name = "size_color")
public class SizeColorEntity implements Serializable {

    private static final long serialVersionUID = 2769988505622788204L;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_size")
    private SizeEntity size;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_color")
    private ColorEntity color;

    @NotNull
    private Integer amount;

}
