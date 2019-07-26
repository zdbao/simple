package com.ls.design.proxy;

/**
 * 代理模式： 由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象与目标对象之前的中介。
 * 优点：
 *      1.  代理对象在客户端和目标对象之间起到一个中介作用和保护目标对象的作用
 *      2.  代理对象可以扩展目标对象的功能
 *      3.  代理对象能将客户端与目标对象隔离，在一定程度上降低了系统的耦合。
 * 缺点:
 *      1.  在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢。
 *      2.  增加了系统的复杂度。
 * @date: 2019年07月26日
 * @author: leslie.zhang
 */
public class ProxyTest {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
