package com.welshjm.Lab5_welshjm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name="product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Product {

    @Id
    @Column(name="id")
    private BigInteger id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoryId")
    private Category categoryId;


}
