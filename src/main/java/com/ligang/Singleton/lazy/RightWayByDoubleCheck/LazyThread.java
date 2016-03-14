package com.ligang.Singleton.lazy.RightWayByDoubleCheck;

/**
 * Created by Joker on 2016/3/14.
 */
public class LazyThread extends Thread {
    
    @Override
    public void run() {
        System.out.println(LazySingleton.getInstance().hashCode());
    }
}
