package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient=null;

    private SocketClient(){

    }
    public static SocketClient getInstance(){
        if(socketClient==null){
           socketClient=new SocketClient();
        }
        return socketClient;
    }//객체가 null이라면 socketClient를 새로 생성해주고 아니라면 바로 socketClient를 반환
    public void connect(){
        System.out.println("connect");
    } //제대로 생성되었으면 connect 메시지를 띄움
}
