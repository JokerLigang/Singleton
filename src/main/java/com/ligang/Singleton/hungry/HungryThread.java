package com.ligang.Singleton.hungry;

/**
 * Created by Joker on 2016/3/14.
 */
public class HungryThread extends Thread {
    
    @Override
    public void run() {
        System.out.println(
                HungrySingleton.getInstance().hashCode()
        );
    }
}
