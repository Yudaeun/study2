package com.example.restaurantorderservice;

import org.junit.jupiter.api.Test;

/*
요구사항
- 음식점에서 음식을 주문하는 과정 구현
1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
    ㄴ 손님, 메뉴판, 돈까스/우동(o), 김밥 ect, 요리사, 요리(o)
2. 객체들 간의 관계를 고민
    ㄴ 손님-메뉴판
    ㄴ 손님-요리사
    ㄴ 요리사-요리
3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링하기
    ㄴ 손님-손님 타입 추상화
    ㄴ 돈까스/우동/김밥-요리 타입 추상화
    ㄴ 메뉴판-메뉴판 타입 추상화
    ㄴ 메뉴-메뉴 타입 추상화
4. 협력을 설계
5. 객체들을 포괄하는 타입에 적절한 책임을 할당
6. 구현하기
* */
public class CustomerTest {
    @Test
    void name(){

    }
}
