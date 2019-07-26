package com.ls.design.factory.method;

/**
 * 工厂方法模式。  定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。<br>
 *
 * 扩展： 简单工厂模式： 如果把创建的对象称为“产品”，把创建产品的对象称为“工厂”。如果要创建的产品不多，只要一个工厂类就可以完成，那这种模式就叫做“简单工厂模式”。<br>
 *              简单工厂模式不属于23种设计模式，它的缺点是增加新产品时会违背“开闭原则”。<br>
 *
 * 工厂方法模式是“简单工厂模式”的一种抽象。其好处就是在扩展新产品时不需要更改原来的代码。
 * 优点：
 *      1.  用户只需要知道具体工厂的名称就可以得到想要的产品，无需知道产品的创建工程。
 *      2.  在系统增加新的产品时只需要增加具体产品类和对应的具体工厂类，无需对原工厂类进行修改，满足开闭原则。
 * 缺点：
 *      每增加一个产品就要增加一个具体产品类和具体工厂类，增加了系统的复杂度。
 *
 * 主要角色:
 *      1.  抽象工厂： 提供创建产品的接口，调用者通过它访问具体工厂的newProduct()方法来创建产品。
 *      2.  具体工厂： 实现了抽象工厂中的方法，完成具体的产品创建。
 *      3.  抽象产品： 定义了产品的规范，描述产品的特性和功能。
 *      4.  具体产品： 实现抽象产品接口，由具体工厂创建，与具体工厂一一对应。
 *
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class FactoryTest {

    public static void main(String[] args) {
        AnimalFarm farm1 = new HorseFarm();
        farm1.newAnimal();
        AnimalFarm farm2 = new CattleFarm();
        farm2.newAnimal();
    }
}