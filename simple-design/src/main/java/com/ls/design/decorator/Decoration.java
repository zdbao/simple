package com.ls.design.decorator;

/**
 * 抽象装饰角色： 装修
 * @date: 2019年08月09日
 * @author: leslie.zhang
 */
public class Decoration implements House{

    House house;

    public Decoration(House house) {
        this.house = house;
    }


    public void display() {
        house.display();
    }
}
