package com.rediscache.bean;

/**
 * Created by liwk
 * Date:2018/8/6 10:59
 */
public class TestBean implements java.io.Serializable {
    private Integer id;
    private String lastName;

    @Override
    public String toString() {
        return "TestBean{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
