package com.company.design.decorator;

public class A3 extends audiDecorator{
    public A3(ICar audi, String modelName, int modelPrice) {
        super(audi, modelName, 1000);
    }
}
