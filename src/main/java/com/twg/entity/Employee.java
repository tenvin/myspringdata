package com.twg.entity;

import javax.persistence.*;

/**
 * 先开发实体类，再自动生成表
 */
@Entity
@Table(name="test_employee")
public class Employee {

    @GeneratedValue
    @Id
    private Integer id;

    @Column(length = 20)
    private String name;

    private Integer age;

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
}
