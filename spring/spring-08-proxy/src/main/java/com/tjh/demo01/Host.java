package com.tjh.demo01;

//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东：我要出租房子！");
    }
}
