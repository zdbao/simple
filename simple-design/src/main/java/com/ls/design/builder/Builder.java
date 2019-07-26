package com.ls.design.builder;

/**
 * 抽象建造者。 包含创建各个子部件的抽象方法
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public abstract class Builder {

    /**
     * 创建产品对象
     * @date: 2019年07月26日
     * @author: leslie.zhang
     */
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    /**
     * 返回产品对象
     * @date: 2019年07月26日
     * @author: leslie.zhang
     */
    public Product getResult(){
        return product;
    }
}
