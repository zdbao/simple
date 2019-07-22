package com.ls.design.singleton;

/**
 * 单例模式。 懒加载，也就是懒汉模式。也就是在需要使用的时候才会被实例化。<br>
 * 缺点： 因为无法保证实例化时是否是在多线程环境，所以增加了volatile和synchronized，造成每次访问时都要同步，会影响性能，并且也会消耗很多资源。
 * 问题：懒汉模式能不能用静态内部类来实例化该对象？
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
public class LazySingleton {

    /**
     * 单例模式必然有个静态的私有对象。volatile用来保证这个唯一的对象在所有线程中是同步的。
     */
    private static volatile LazySingleton instance = null;

    /**
     * 单例模式必然有个私有的实例化方法(也就是表示不允许用new来显式的去执行该类的实例化)
     */
    private LazySingleton(){}

    /**
     * 必须包含一个共有的，静态并且同步的初始化方法。因为是懒汉模式，无法保证第一次实例化是否是在多线程中执行。所以增加synchronized来限制多线程的访问。
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
