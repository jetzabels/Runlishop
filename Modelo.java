package com.runli.labarotariotematico;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "modelos")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String modelo;
    private Integer stock_total;
    private BigDecimal costo_china;

    public Integer getId() { return id; }
    public String getModelo() { return modelo; }
    public Integer getStock_total() { return stock_total; }
    public BigDecimal getCosto_china() { return costo_china; }
}
