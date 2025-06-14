package com.saas.subscription_api;
import com.saas.subscription_api.dto.SubscriptionDto;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class SubscriptionDtoTest {

    @Test
    void testConstructorAndGetters() {
        LocalDate start = LocalDate.of(2025, 1, 1);
        LocalDate end = LocalDate.of(2025, 12, 31);
        SubscriptionDto dto = new SubscriptionDto(1L, "Premium", start, end, 100L);

        assertEquals(1L, dto.getId());
        assertEquals("Premium", dto.getType());
        assertEquals(start, dto.getStartDate());
        assertEquals(end, dto.getEndDate());
        assertEquals(100L, dto.getUserId());
    }

    @Test
    void testSetters() {
        SubscriptionDto dto = new SubscriptionDto();{
        dto.setId(2L);
        dto.setType("Standard");
        dto.setStartDate(LocalDate.of(2025, 2, 1));
        dto.setEndDate(LocalDate.of(2025, 11, 30));
        dto.setUserId(200L);

        assertEquals(2L, dto.getId());
        assertEquals("Standard", dto.getType());
        assertEquals(LocalDate.of(2025, 2, 1), dto.getStartDate());
        assertEquals(LocalDate.of(2025, 11, 30), dto.getEndDate());
        assertEquals(200L, dto.getUserId());
    }
}
}
