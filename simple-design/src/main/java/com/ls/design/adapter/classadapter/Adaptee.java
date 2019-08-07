package com.ls.design.adapter.classadapter;

/**
 * 适配者接口
 * @date: 2019年08月07日
 * @author: leslie.zhang
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("适配者中的业务代码被调用......");
    }
}
