package hpc.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private Product product;
    private long productId;
    private double price;
    private double quantity;
    @ManyToOne @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;
}
