package com.ligang.Singleton.lazy.RightWayByDoubleCheck;

/**
 * Created by Joker on 2016/3/14.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

     public static LazySingleton getInstance(){
        if(lazySingleton!=null){
        }else{
            synchronized (LazySingleton.class){
                if(lazySingleton==null){
                    lazySingleton =  new LazySingleton();
                }
            }

        }
        return lazySingleton;
    }


}
