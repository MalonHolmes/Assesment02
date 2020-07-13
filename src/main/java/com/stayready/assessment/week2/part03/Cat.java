package com.stayready.assessment.week2.part03;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        super(name,age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super(age);
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        name = "Cat name";
        age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
