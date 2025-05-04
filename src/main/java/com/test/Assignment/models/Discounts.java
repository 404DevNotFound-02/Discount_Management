package com.test.Assignment.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "discounts")
@Data
public class Discounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dis_id;
    private String code;

    private String title;
    private DiscountType type;
    private LocalDateTime expiryDate;
    private String customer;
    private int minDiscount;
    private int maxDiscount;
    private int usagePerCustomer;
}
