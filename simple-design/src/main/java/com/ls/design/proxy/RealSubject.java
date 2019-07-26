package com.ls.design.proxy;

/**
 * 真实主题。实现了主题接口的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class RealSubject implements Subject{

    public void request() {
        System.out.println("---访问真实的主题方法...");
    }
}
