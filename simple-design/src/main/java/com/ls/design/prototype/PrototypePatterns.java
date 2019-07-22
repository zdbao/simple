package com.ls.design.prototype;

/**
 * 原型模式。 用一个实例作为原型，通过复制这个原型来创建一个和原型相同或相似的新对象。（比如就像一个模具，我们可以通过这个模具生产一模一样的手办。）<br>
 * 注意： 在java中clone方法本身为潜克隆，那对应的原型模式也分为浅克隆和深克隆。<br>
 * 什么时候用到原型模式： 1.对象之间相同或者相似。2.对象的创建过程比较麻烦，但复制比较简单
 *
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
public class PrototypePatterns {

    /**
     * 测试入口
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypePatterns test = new PrototypePatterns();
//        test.testRealizeType();
        test.testPrototypeManager();
    }

    private void testRealizeType() throws CloneNotSupportedException {
        //实例化一个原型类
        Realizetype obj1 = new Realizetype();
        //克隆一个原型类。
        Realizetype obj2 = (Realizetype) obj1.clone();
        //比较一下？
        System.out.println("obj1==obj2? " + (obj1 == obj2));
        System.out.println("obj1.equals(obj2)? " + (obj1.equals(obj2)));
    }

    private void testPrototypeManager(){
        PrototypeManager pm=new PrototypeManager();
        Shape obj1=(Circle)pm.getShape("Circle");
        obj1.countArea();
        Shape obj2=(Shape)pm.getShape("Square");
        obj2.countArea();
    }
}
