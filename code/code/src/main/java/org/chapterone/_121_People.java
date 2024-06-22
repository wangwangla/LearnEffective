package org.chapterone;

public class _121_People {
    private int age;
    private String name;
    private String addr;
    private String phoneNum;

    public _121_People() {
        this(0);
    }

    public _121_People(int age) {
        this(age,"");
    }
    public _121_People(int age,String name) {
        this(age,name,"");
    }
    public _121_People(int age,String name,String addr) {
        this(age,name,addr,"");
    }

    public _121_People(int age,String name,String addr,String phoneNum){
        this.age = age;
        this.name = name;
        this.addr = addr;
        this.phoneNum = phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    @Override
    public String toString() {
        return "_121_People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
