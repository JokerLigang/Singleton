package com.ligang.Singleton.Static;

/**
 * Created by Joker on 2016/3/14.
 */
public class StaticSingleton {

    private static StaticSingleton staticSingleton=null;

    private StaticSingleton(){};

    static {

        staticSingleton = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return staticSingleton;
    }
}
