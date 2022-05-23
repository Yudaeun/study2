package com.company.design;

import com.company.design.adpater.*;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        AClazz aClazz=new AClazz();
//        BClazz bClazz=new BClazz();
//
//        SocketClient aClient=aClazz.getSocketClient();
//        SocketClient bClient=bClazz.getSocketClient();
//
//        System.out.println("두 개의 객체가 동일한가요?");
//        System.out.println(aClient.equals(bClient));
//
        HairDryer hairDryer=new HairDryer();
        connect(hairDryer);
        //에어컨과 클리너는 220v 라서 connect 함수를 이용하면 바로 연결이 되지 않는다.
        //그래서 adpater 클래스를 이용해서 220v에서도 110v를 이용할 수 있게 만들어 준다.
        Aircon aircon=new Aircon();
        Electronic110V airAdapter=new SocketAdapter(aircon);
        connect(airAdapter);

        Cleaner cleaner=new Cleaner();
        Electronic110V cleanerAdapter=new SocketAdapter(cleaner);
        connect(cleanerAdapter);

    }
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
