package com.ligang.Singleton.Static;


import com.ligang.Singleton.StaticInnerClass.StaticInnerClassSingleton;

/**
 * Created by Joker on 2016/3/14.
 */
public class StaticThread extends Thread {
    
    @Override
    public void run() {
        System.out.println(StaticSingleton.getInstance().hashCode());
    }
}
