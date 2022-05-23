package com.company.design.adpater;

public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("클리너 220v on");
    }
}
