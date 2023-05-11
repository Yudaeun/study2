package com.example.restaurantorderservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest(){
        Cooking cooking= new Cooking();
        MenuItem menuItem=new MenuItem("돈까스",5000);
        Cook cook=cooking.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("돈까스",5000));
        //(Cook이라는) 객체들끼리 비교할 때는 equals() and HashCode()가 있어야 한다.
    }
}
