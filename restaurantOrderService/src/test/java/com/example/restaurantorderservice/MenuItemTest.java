package com.example.restaurantorderservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {
    @DisplayName("메뉴항목을 생성한다.")
    @Test
    void createTest(){
        assertThatCode(() -> new MenuItem("우동",5000))
                .doesNotThrowAnyException();
    }
}
