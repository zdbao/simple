package com.ls.design.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 既然原型模式只是拷贝一个现存的对象的话，如果用模具来比喻，那不同的模具应该就需要一个模具的管理者来管理，由管理者来管理要生产的东西应该选择什么模具。<br>
 * 这就好比你要买一个手办，你把自己的需求告诉卖手办的人，卖家来根据你的需求选择合适的模具生产。
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
public class PrototypeManager {
    private Map<String, Shape> ht = new HashMap<String, Shape>();
    public PrototypeManager(){
        ht.put("Circle",new Circle());
        ht.put("Square",new Square());
    }
    /**
     * 通过key来获取一个新的图案，当时是通过克隆的方式
     */
    public Shape getShape(String key){
        Shape temp = ht.get(key);
        return (Shape)temp.clone();
    }

}

/**
 * 定义一个形状的原型接口。包含了克隆方法，和计算面积的方法。
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
interface Shape extends Cloneable{
    /**
     * 克隆
     */
    public Object clone();
    /**
     * 计算面积
     */
    public void countArea();
}

/**
 * 一个圆形
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
class Circle implements Shape{

    @Override
    public Object clone() {
        Circle c = null;
        try {
            c = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("---拷贝圆失败");
        }
        return c;
    }

    public void countArea() {
        int r=0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        System.out.println("该圆的面积="+3.1415*r*r+"\n");
    }
}

/**
 * 一个方形
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
class Square implements Shape{

    @Override
    public Object clone() {
        Square b = null;
        try {
            b = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("---拷贝方形失败---");
        }
        return b;
    }

    public void countArea() {
        int a=0;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.println("该正方形的面积="+a*a+"\n");
    }
}
