package org.chapterone;

import org.chapterone.bean.PeopleInfo;

public class _122_People {
    private int age;
    private String name;
    private String addr;
    private String phoneNum;

    public _122_People(PeopleInfo peopleInfo){
        this.age = peopleInfo.getAge();
        this.name = peopleInfo.getName();
        this.addr = peopleInfo.getAddr();
        this.phoneNum = peopleInfo.getPhoneNum();
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
