package com.ls.design.prototype;

/**
 * 原型类。 通过new来实例化一个新的原型类。通过clone来克隆该原型类。
 * @date: 2019年07月22日
 * @author: leslie.zhang
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("---具体原型创建成功---");
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("----具体原型复制成功---");
        return (Realizetype)super.clone();
    }
}
