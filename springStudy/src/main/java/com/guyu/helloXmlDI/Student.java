package com.guyu.helloXmlDI;

import java.util.Arrays;
import java.util.Map;

/**
 * @author : wenhaojie
 * @date : 2023/1/3 11:58
 * @description : some description
 */
public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String expression;

    private String expression1;

    private Clazz clazz;

    private String[] hobbies;

    private Map<String, Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression1() {
        return expression1;
    }

    public void setExpression1(String expression1) {
        this.expression1 = expression1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", expression='" + expression + '\'' +
                ", expression1='" + expression1 + '\'' +
                ", clazz=" + clazz +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public Student(Integer id, String name, Integer age, String sex, String expression, String expression1) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.expression = expression;
        this.expression1 = expression1;
    }

    public Student() {
    }
}