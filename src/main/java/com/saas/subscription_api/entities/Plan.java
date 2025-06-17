package com.saas.subscription_api.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "duration_months")
    private int durationMonths;


    public Plan() {
    }

    public Plan(String name, String description, BigDecimal price, int durationMonths) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.durationMonths = durationMonths;
    }


    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }
}
