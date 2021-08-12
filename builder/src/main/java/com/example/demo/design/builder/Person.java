package com.example.demo.design.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yao
 * @date 2019/12/4
 */
@Getter
@Setter
public final class Person {

    private final String name;

    private final Integer age;

    private final Nationality nationality;

    private final SkinColor skinColor;

    public Person(Builder.Properties properties) {
        this.name = properties.name;
        this.age = properties.age;
        this.nationality = properties.nationality;
        this.skinColor = properties.skinColor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (null != nationality) {
            sb.append(" comes from " + nationality.toString() + " and");
        }
        if (null != age) {
            sb.append(" " + age + " years old,");
        }
        if (null != skinColor) {
            sb.append(" and has " + skinColor + " skin");
        }
        sb.append(".");
        return sb.toString();
    }
}
