package com.saas.subscription_api;


import org.junit.jupiter.api.Test;
import com.saas.subscription_api.entities.Subscription;
import com.saas.subscription_api.entities.User;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SubscriptionTest {

    @Test
    void testConstructorAndGetters() {
        User user = new User(); // Dummy user
        LocalDate start = LocalDate.of(2025, 1, 1);
        LocalDate end = LocalDate.of(2025, 12, 31);

        Subscription subscription = new Subscription("Premium", start, end, true, user);

        assertEquals("Premium", subscription.getPlanName());
        assertEquals(start, subscription.getStartDate());
        assertEquals(end, subscription.getEndDate());
        assertTrue(subscription.isActive());
        assertEquals(user, subscription.getUser());
    }

    @Test
    void testSetters() {
        Subscription subscription = new Subscription();
        User user = new User();
        LocalDate start = LocalDate.of(2025, 2, 1);
        LocalDate end = LocalDate.of(2025, 11, 30);

        subscription.setPlanName("Basic");
        subscription.setStartDate(start);
        subscription.setEndDate(end);
        subscription.setActive(false);
        subscription.setUser(user);

        assertEquals("Basic", subscription.getPlanName());
        assertEquals(start, subscription.getStartDate());
        assertEquals(end, subscription.getEndDate());
        assertFalse(subscription.isActive());
        assertEquals(user, subscription.getUser());
    }
}

