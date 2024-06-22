package org.chapterone.bean;

public class People {
    private String name;
    private int age;

    public People(){

    }

    public People(String name,int age){
        this.name = name;
        this.age = age;
    }

    public People(int age,String name){
        this.name = name;
        this.age = age;
    }
}
