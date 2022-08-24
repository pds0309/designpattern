package com.pds.gof.factorymethod.good;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TacoTruckTest {

    private TacoTruck tacoTruck;

    @Test
    @DisplayName("보통맛 타코 주문")
    void shouldReturnNormalTaco() {
        tacoTruck = new NormalTacoMaker();
        assertThat(tacoTruck.orderTaco())
                .isNotNull()
                .hasNoNullFieldsOrProperties()
                .hasFieldOrPropertyWithValue("price", 1500);
    }

    @Test
    @DisplayName("매운맛 타코 주문")
    void shouldReturnHotTaco() {
        tacoTruck = new HotTacoMaker();
        assertThat(tacoTruck.orderTaco())
                .isNotNull()
                .hasNoNullFieldsOrProperties()
                .hasFieldOrPropertyWithValue("price", 1700);
    }
}
