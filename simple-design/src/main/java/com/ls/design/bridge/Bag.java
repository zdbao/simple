package com.ls.design.bridge;

/**
 * 抽象化角色： 包
 * @date: 2019年08月09日
 * @author: leslie.zhang
 */
public abstract class Bag {

    protected Color color;
    public void setColor(Color color){
        this.color = color;
    }
    public abstract String getName();
}
