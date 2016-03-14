package com.ligang.Singleton.hungry;

/**
 * Created by Joker on 2016/3/14.
 */
public class HungrySingleton {

    //立即加载模式
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
