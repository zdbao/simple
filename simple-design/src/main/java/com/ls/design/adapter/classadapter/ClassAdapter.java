package com.ls.design.adapter.classadapter;

/**
 * 类适配器
 * @date: 2019年08月07日
 * @author: leslie.zhang
 */
public class ClassAdapter extends Adaptee implements Target{
    public void request() {
        specificRequest();
    }
}
