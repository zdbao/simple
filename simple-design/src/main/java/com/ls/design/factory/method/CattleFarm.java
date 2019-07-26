package com.ls.design.factory.method;

/**
 * 具体工厂2
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class CattleFarm implements AnimalFarm {

    public Animal newAnimal() {
        System.out.println("具体工厂牛生成-->具体产品牛...");
        return new Cattle();
    }
}
