package org.chapterone.bean;

public class PeopleInfo {
    private int age;
    private String name;
    private String addr;
    private String phoneNum;
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
