package com.ls.design.builder;

/**
 * 产品，包含多个组成部件的复杂对象
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show(){
        //显示产品特性
        System.out.println("partA: " + partA + "---partB: " + partB + "---partC: " + partC);
    }
}
