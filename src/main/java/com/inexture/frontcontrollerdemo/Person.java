package com.inexture.frontcontrollerdemo;

public class Person {

    String greetingStyle;

    public Person() {
        super();
    }

    public Person(String greeting) {
        this.greetingStyle = greeting;
    }

    public String getGreetingStyle() {
        return greetingStyle;
    }

    public void setGreetingStyle(String greetingStyle) {
        this.greetingStyle = greetingStyle;
    }
}
