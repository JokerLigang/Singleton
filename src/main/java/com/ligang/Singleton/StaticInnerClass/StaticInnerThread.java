package com.ligang.Singleton.StaticInnerClass;


/**
 * Created by Joker on 2016/3/14.
 */
public class StaticInnerThread extends Thread {
    
    @Override
    public void run() {
        System.out.println(StaticInnerClassSingleton.getInstance().hashCode());
    }
}
