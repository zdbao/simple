package com.ls.design.bridge;

/**
 * 扩展抽象化角色： 钱包
 * @date: 2019年08月09日
 * @author: leslie.zhang
 */
public class Wallet extends Bag {
    @Override
    public String getName() {
        return color.getColor() + " Wallet";
    }
}
