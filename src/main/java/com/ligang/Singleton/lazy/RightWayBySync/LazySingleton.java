package com.ligang.Singleton.lazy.RightWayBySync;

/**
 * Created by Joker on 2016/3/14.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    //整个方法加同步,效率低
    synchronized public static LazySingleton getInstance(){
        if(lazySingleton!=null){
        }else{
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }


}
