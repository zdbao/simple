package com.ls.design.builder;

/**
 * 建造者模式： 举个例子，电脑是有CPU，内存，显卡，显示器，主板等部件组装成的。采购员不可能买零件自己组装，这时候就需要一个电脑销售公司，采购员讲自己需求告诉销售公司，销售公司来根据需求组装电脑。<br>
 * 书名定义： 将一个复杂对象的构造与它的表示进行分离，使同样的构建过程可以创建不同的表示。<br>
 * 也就是将一个复杂的对象分解成多个简单的对象，然后一步步构建而成。它将变与不变分离，即产品的组成部分不变，但每一部分是可以灵活选择的。<br>
 * 优点： 1. 各个具体的建造者相互独立，有利于系统扩展。
 *       2. 客户端不必知道产品内部组成的细节，便于控制细节风险。
 * 缺点： 1. 产品的组成部分必须相同，这限制了使用范围
 *       2. 如果产品的内部变化复杂，该模式会增加很多的建造者类。
 *
 * 主要角色包含：
 *      1.  产品角色： 它是包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件。
 *      2.  抽象建造者：  包含创建产品各个子部件的抽象方法接口，通常还包含一个复杂产品的方法getResult()
 *      3.  具体建造者:  实现“抽象建造者”接口，完成复杂产品的各个部件的具体创建方法。
 *      4.  指挥者:    调用建造者对象中的部件构造与装配方法完成复杂对象的创建。 在指挥者中不涉及具体产品的信息。
 * @date: 2019年07月25日
 * @author: leslie.zhang
 */
public class BuilderTest {


    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
