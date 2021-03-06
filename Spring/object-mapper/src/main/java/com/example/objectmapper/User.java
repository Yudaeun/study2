package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;


    public User(){
        this.name=null;
        this.age=0;
    }//디폴트 생성자
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age,String phoneNumber){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }//생성자 오버로딩

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
