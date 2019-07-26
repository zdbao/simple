package com.ls.design.proxy;

/**
 * 代理类。 提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class Proxy implements Subject{
    private RealSubject subject;
    public void request() {
        if(subject == null){
            subject = new RealSubject();
        }
        preRequest();
        subject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理...");
    }
    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理...");
    }
}
