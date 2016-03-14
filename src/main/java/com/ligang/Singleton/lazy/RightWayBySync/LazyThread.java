package com.ligang.Singleton.lazy.RightWayBySync;

/**
 * Created by Joker on 2016/3/14.
 */
public class LazyThread extends Thread {
    
    @Override
    public void run() {
        System.out.println(LazySingleton.getInstance().hashCode());
    }
}
