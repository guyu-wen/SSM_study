package com.guyu.helloXmlDI;

import java.util.List;
import java.util.Map;

/**
 * @author : wenhaojie
 * @date : 2023/1/3 20:27
 * @description : some description
 */
public class Clazz {
    private Integer clazzId;

    private String ClassName;

    private List<Student> students;

    private Map<String, Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Student> getStudents() {

        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    // 无参有参构造函数

    // setget方法
    // toString方法

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId=" + clazzId +
                ", ClassName='" + ClassName + '\'' +
                ", students=" + students +
                ", teacherMap=" + teacherMap +
                '}';
    }
}