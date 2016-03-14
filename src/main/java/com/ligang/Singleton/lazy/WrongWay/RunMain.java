package com.ligang.Singleton.lazy.WrongWay;

/**
 * Created by Joker on 2016/3/14.
 */
public class RunMain {

    public static void main(String[] args) {

        LazyThread lazyThread1 =  new LazyThread();
        LazyThread lazyThread2 =  new LazyThread();
        LazyThread lazyThread3 =  new LazyThread();

        lazyThread1.start();
        lazyThread2.start();
        lazyThread3.start();
    }
}
