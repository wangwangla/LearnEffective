package org.chapterone;

import org.chapterone.bean.PeopleInfo;

public class _123_People {
    private int age;
    private String name;
    private String addr;
    private String phoneNum;

    private  _123_People(Builder peopleInfo){
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

    public static class Builder{
        private int age;
        private String name;
        private String addr;
        private String phoneNum;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public Builder setAddr(String addr) {
            this.addr = addr;
            return this;
        }

        public String getAddr() {
            return addr;
        }

        public _123_People build(){
            return new _123_People(this);
        }
    }

    public static void main(String[] args) {
         new _123_People
                 .Builder()
                 .setAddr("xx")
                 .build();
    }
}
