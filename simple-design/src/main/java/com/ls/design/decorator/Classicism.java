package com.ls.design.decorator;

/**
 * 具体装饰角色： 古典风格
 * @date: 2019年08月09日
 * @author: leslie.zhang
 */
public class Classicism extends Decoration{
    public Classicism(House house) {
        super(house);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger(){
        System.out.println("--古典风格");
    }
}
