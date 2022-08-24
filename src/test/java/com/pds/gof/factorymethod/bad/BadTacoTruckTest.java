package com.pds.gof.factorymethod.bad;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BadTacoTruckTest {

    private static final String TYPE_0 = "치즈맛";
    private static final String TYPE_1 = "보통맛";
    private static final String TYPE_2 = "매운맛";

    @Test
    @DisplayName("치즈맛 타코 주문")
    void shouldReturnCheeseTaco() {
        BadTaco badTaco = BadTacoTruck.orderTaco(TYPE_0);
        assertThat(badTaco)
                .isNotNull()
                .hasNoNullFieldsOrProperties()
                .hasFieldOrPropertyWithValue("price", 1800);
    }


    @Test
    @DisplayName("보통맛 타코 주문")
    void shouldReturnNormalTaco() {
        BadTaco badTaco = BadTacoTruck.orderTaco(TYPE_1);
        assertThat(badTaco)
                .isNotNull()
                .hasNoNullFieldsOrProperties()
                .hasFieldOrPropertyWithValue("price", 1500);
    }

    @Test
    @DisplayName("매운맛이 먹고 싶은데 없네")
    void hotTacoRequestShouldThrowsException() {
        assertThatThrownBy(() -> BadTacoTruck.orderTaco(TYPE_2))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
