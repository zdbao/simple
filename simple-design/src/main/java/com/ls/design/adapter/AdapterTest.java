package com.ls.design.adapter;

/**
 * 适配器模式： 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 *      分为： 类结构型模式、对象结构型模式。 前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
 * 优点:
 *      1. 客户端通过适配器可以透明地调用目标接口
 *      2. 复用了现存的类，程序员不需要修改原有代码而重用现有到的适配者类。
 *      3. 将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。
 * 缺点：
 *      更换适配器的实现过程比较复杂
 * 主要角色包含：
 *      1. 目标(Target)接口: 当前系统业务所期待的接口，它可以是抽象类或接口
 *      2. 适配者(Adaptee)类: 它是被业务访问和适配的现存组件库中的组件接口
 *      3. 适配器(Adapter)类: 它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按照目标接口的格式访问适配者。
 * @date: 2019年08月07日
 * @author: leslie.zhang
 */
public class AdapterTest {

    public static void main(String[] args) {
        //查看各个包下的AdapterTest
    }
}
