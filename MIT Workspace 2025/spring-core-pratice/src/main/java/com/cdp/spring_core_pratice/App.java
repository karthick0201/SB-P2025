package com.cdp.spring_core_pratice;

import com.cdp.spring.beans.Airtel;
import com.cdp.spring.beans.Sim;
import com.cdp.spring.beans.Vodofone;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Sim air = new Airtel();
        air.call();
        air.sendSms();
        Sim vodo = new Vodofone();
        vodo.call();
        vodo.sendSms();


    }
}
