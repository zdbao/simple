package com.ls.design.decorator;

/**
 * 装饰模式 (结构型模式)
 * 什么时候用装饰模式？ 现实生活中，如装修房子，相片增加相框，衣服增加装饰图案等。
 * 定义： 在不改变现有对象结构的情况下，动态的给该对象增加一些扩展功能的模式。
 * 优点：
 *      1. 采用装饰模式扩展对象的功能比采用继承方式灵活
 *      2. 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合
 * 缺点：
 *      装饰模式增加了许多子类，如果过度使用会使程序变得复杂。
 *
 * 包含角色：
 *      1. 抽象构件角色(Component): 定义一个抽象接口以规范准备接收附加责任的对象
 *      2. 具体构件角色(Concrete Component): 实现抽象构件，通过装饰角色为其添加一些职责
 *      3. 抽象装饰角色(Decorator): 继承抽象构件，并包含具体构件角色实例，可以通过其子类扩展具体构件的功能。
 *      4. 具体装饰类角色(ConcreteDecorator): 实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 *
 * 样例： 以房子装修为例，房子即为Component，本身为毛坯房(Concrete Component), 要对其装修(Decorator), 装修成古典风格，西欧风格等(ConcreteDecorator)。
 *
 * @date: 2019年08月09日
 * @author: leslie.zhang
 */
public class DecoratorTest {

    public static void main(String[] args) {
        House house = new RoughcastHouse();
        house.display();
        House house2 = new WesternEuropean(house);
        house2.display();
        House house3 = new Classicism(house);
        house3.display();
    }
}
