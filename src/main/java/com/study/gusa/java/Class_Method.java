package com.study.gusa.java;

public class Class_Method {

    public static void main(String[] args) {

        /* Ex01
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
         */

        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        System.out.println("tv1의 channel값은 " + tv1.channel + "입니다");
        System.out.println("tv2의 channel값은 " + tv2.channel + "입니다");

        tv1.channel=7;
        System.out.println("tv1의 channel값을 7로 변경하였습니다.");
        System.out.println("tv1의 channel값은 " + tv1.channel + "입니다");
        System.out.println("tv2의 channel값은 " + tv2.channel + "입니다");
    }

}

class Tv {
    //Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    //Tv의 기능(메서드)
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
