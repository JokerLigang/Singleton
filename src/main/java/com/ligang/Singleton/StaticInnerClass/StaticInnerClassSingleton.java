package com.ligang.Singleton.StaticInnerClass;

/**
 * Created by Joker on 2016/3/14.
 */
public class StaticInnerClassSingleton {

    private static class SingletonHandle{
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHandle.singleton;
    }

}
