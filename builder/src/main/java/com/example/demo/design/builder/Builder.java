package com.example.demo.design.builder;

/**
 * @author yao
 * @date 2019/12/4
 */
public class Builder {

    public static class Properties {

        public String name;

        public Integer age;

        public Nationality nationality;

        public SkinColor skinColor;

        public Properties name(String name) {
            this.name = name;
            return this;
        }

        public Properties age(Integer age) {
            this.age = age;
            return this;
        }

        public Properties nationality(Nationality nationality) {
            this.nationality = nationality;
            return this;
        }

        public Properties skinColor(SkinColor skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
