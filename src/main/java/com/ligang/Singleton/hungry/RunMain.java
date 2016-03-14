package com.ligang.Singleton.hungry;

/**
 * Created by Joker on 2016/3/14.
 */
public class RunMain {
    
    public static void main(String[] args) {
        HungryThread hungryThread1 =  new HungryThread();
        HungryThread hungryThread2 =  new HungryThread();
        HungryThread hungryThread3 =  new HungryThread();

        hungryThread1.start();
        hungryThread2.start();
        hungryThread3.start();
    }
}
