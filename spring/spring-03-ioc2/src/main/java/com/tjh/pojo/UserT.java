package com.tjh.pojo;

public class UserT {
    private String name;

    public UserT(){
        System.out.println("UserT 被创建了 ");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
