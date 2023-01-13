package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly rw = new RWOnly();
//        rw.name = "vipin";
//        java: name has private access in com.driver.RWOnly
        rw.setName("vipin");
        String ans = rw.getName();
        System.out.println(ans);

    }
}