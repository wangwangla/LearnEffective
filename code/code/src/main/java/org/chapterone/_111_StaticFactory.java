package org.chapterone;

import org.chapterone.bean.People;
import org.chapterone.bean.Student;

import java.lang.reflect.Constructor;

public class _111_StaticFactory {
    public static void main(String[] args) {
        System.out.println(Boolean.valueOf("FALSE"));
        System.out.println(Boolean.valueOf("TRUE"));
    }

    /**
     * 存在名称  明白含义
     * @return
     */
    public static People createPeople(){
        return new People();
    }

    /**
     * 两个构造函数  不知所云
     *
     *
     */
    public void createInstace(){
        People people1 = new People(12,"xx");
        People people2 = new People("xx",12);

    }

    /**
     * 不需要每次都创建对象
     *
     *
     */
    private static People people = new People();
    public static People createInstancePeople(){
        return people;
    }

    /**
     * 可以返回子类
     *
     *
     */
    private static People createInstace2(){
        return new Student();
    }

    /**
     * 创建的类可以不存在
     *
     */
    private static People createTeach() throws Exception {
        Class<?> aClass = Class.forName("org.chapterone.Teach");
        Constructor<?> constructor = aClass.getConstructors()[0];
        People o =(People) constructor.newInstance();
        return o;
    }


    /**
     * 根据参数类型创建不同的对象
     * @param type
     * @return
     */
    private static People createInstace3(int type){
        if (type == 1){
            return new Student();
        }else if (type == 2){
            return new People();
        }
        return new People();
    }

    /*****************************/


}
