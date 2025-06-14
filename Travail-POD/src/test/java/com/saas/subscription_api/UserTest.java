package com.saas.subscription_api;

import com.saas.subscription_api.entities.User;
import com.saas.subscription_api.entities.Subscription;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testConstructorAndGetters() {
        User user = new User("Titi Tekougang", "titi@gmail.com", "password2025");

        assertEquals("Titi Tekougang", user.getFullName());
        assertEquals("titi@gmail.com", user.getEmail());
        assertEquals("password2025", user.getPassword());
        assertTrue(user.isActive());
    }

    @Test
    void testSetters() {
        User user = new User();
        user.setFullName("keutis Alfred");
        user.setEmail("keutis@gmail.com");
        user.setPassword("secret");
        user.setActive(false);

        assertEquals("keutis Alfred", user.getFullName());
        assertEquals("keutis@gmail.com", user.getEmail());
        assertEquals("secret", user.getPassword());
        assertFalse(user.isActive());
    }

    @Test
    void testSubscriptionsSetterAndGetter() {
        User user = new User();
        Subscription sub1 = new Subscription();
        Subscription sub2 = new Subscription();

        List<Subscription> subscriptionList = new ArrayList<>();
        subscriptionList.add(sub1);
        subscriptionList.add(sub2);

        user.setSubscriptions(subscriptionList);

        assertNotNull(user.getSubscriptions());
        assertEquals(2, user.getSubscriptions().size());
    }
}

