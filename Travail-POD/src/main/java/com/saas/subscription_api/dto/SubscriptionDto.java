package com.saas.subscription_api.dto;

import java.time.LocalDate;

public class SubscriptionDto {
    private Long id;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long userId;

    // Constructeurs
    public SubscriptionDto() {}

    public SubscriptionDto(Long id, String type, LocalDate startDate, LocalDate endDate, Long userId) {
        this.id = id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
