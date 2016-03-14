package com.ligang.Singleton.lazy.WrongWay;

/**
 * Created by Joker on 2016/3/14.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if(lazySingleton!=null){
        }else{
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }


}
