package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {

    private String account;
    private String email;
    private String pw;
    @JsonProperty("phone_number")
    private String phoneNumber; //카멜 케이스는 JsonProperty 어노테이션 없이 전달받을 수 없다.
    @JsonProperty("OTP")
    private String OTP;

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "\naccount='" + account + '\'' +
                ", \nemail='" + email + '\'' +
                ", \npw='" + pw + '\'' +
                ", \nphoneNumber='" + phoneNumber + '\'' +
                ", \nOTP='" + OTP + '\n' +
                '}';
    }
}
