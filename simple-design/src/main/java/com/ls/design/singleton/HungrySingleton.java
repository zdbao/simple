package com.ls.design.singleton;

/**
 * 单例模式。 饿汉模式。 也就是在程序启动时该类在被加载的那一刻就完成了该类的实例化。<br>
 * 问题：饿汉模式能不能用静态内部类来实例化该对象？
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
public class HungrySingleton {

    /**
     * 因为饿汉模式是在加载该类时就会直接实例化，对静态变量设置final。因为它实例化后不会再改变。
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * 单例模式必然有个私有的实例化方法(也就是表示不允许用new来显式的去执行该类的实例化)
     */
    private HungrySingleton(){}

    /**
     * 必须包含一个共有的，因为类已经被实例化，也就无需判断，直接返回即可。
     */
    private static HungrySingleton getInstance(){
        return instance;
    }
}
