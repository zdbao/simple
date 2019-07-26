package com.ls.design.builder;

/**
 * 指挥者： 调用建造者中的方法完成复杂的对象创建
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 产品构建和组装方法
     * @date: 2019年07月26日
     * @author: leslie.zhang
     */
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
