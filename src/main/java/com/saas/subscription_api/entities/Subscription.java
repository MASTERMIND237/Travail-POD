package com.saas.subscription_api.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;

    private LocalDate startDate;

    private LocalDate endDate;

    private boolean active;

    //private String type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // --- Constructeurs ---
    public Subscription() {
    }

    public Subscription(String planName, LocalDate startDate, LocalDate endDate, boolean active, User user) {
        this.planName = planName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
        this.user = user;
    }

    // --- Getters & Setters ---
    public Long getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /*
     *     public String getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }
     */

}

