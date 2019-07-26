package com.ls.design.factory.method;

/**
 * 具体工厂: 养马场
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class HorseFarm implements AnimalFarm {
    public Animal newAnimal() {
        System.out.println("具体工厂马 生成-->具体产品马...");
        return new Horse();
    }
}
