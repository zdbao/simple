package com.ls.design.adapter.classadapter;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试.....");
        Target target = new ClassAdapter();
        target.request();
    }
}
