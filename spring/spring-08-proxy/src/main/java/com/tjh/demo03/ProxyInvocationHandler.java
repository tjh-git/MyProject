package com.tjh.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理示例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();

        //动态代理的本质，就是使用反射机制实现的
        Object result = method.invoke(rent, args);

        fare();
        return result;
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //签署合同
    public void hetong(){
        System.out.println("签租赁合同");
    }

    //收取中介费
    public void fare(){
        System.out.println("收取中介费");
    }

}
