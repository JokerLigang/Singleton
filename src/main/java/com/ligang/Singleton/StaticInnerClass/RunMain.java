package com.ligang.Singleton.StaticInnerClass;

/**
 * Created by Joker on 2016/3/14.
 */
public class RunMain {

    public static void main(String[] args) {

        StaticInnerThread staticInnerThread1 =  new StaticInnerThread();
        StaticInnerThread staticInnerThread2 =  new StaticInnerThread();
        StaticInnerThread staticInnerThread3 =  new StaticInnerThread();

        staticInnerThread1.start();
        staticInnerThread2.start();
        staticInnerThread3.start();
    }
}
