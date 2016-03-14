package com.ligang.Singleton.Static;

/**
 * Created by Joker on 2016/3/14.
 */
public class RunMain {

    public static void main(String[] args) {

        StaticThread staticThread1 =  new StaticThread();
        StaticThread staticThread2 =  new StaticThread();
        StaticThread staticThread3 =  new StaticThread();

        staticThread1.start();
        staticThread2.start();
        staticThread3.start();
    }
}
