package com.saas.subscription_api;

import com.saas.subscription_api.dto.UserDto;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UserDtoTest {

    @Test
    void testConstructorAndGetters() {
        UserDto user = new UserDto(1L, "Titi", "titi@gmail.com");

        assertEquals(1L, user.getId());
        assertEquals("Titi", user.getName());
        assertEquals("titi@gmail.com", user.getEmail());
    }

    @Test
    void testSetters() {
        UserDto user = new UserDto();

        user.setId(2L);
        user.setName("keutis");
        user.setEmail("keutis@gmail.com");

        assertEquals(2L, user.getId());
        assertEquals("keutis", user.getName());
        assertEquals("keutis@gmail.com", user.getEmail());
    }
}
