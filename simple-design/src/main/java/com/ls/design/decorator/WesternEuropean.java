package com.ls.design.decorator;

/**
 * 具体装饰角色： 西欧风格
 * @date: 2019年08月09日
 * @author: leslie.zhang
 */
public class WesternEuropean extends Decoration{
    public WesternEuropean(House house) {
        super(house);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }
    public void setChanger(){
        System.out.println("--西欧风格");
    }
}
