package com.spring.jmx;


//@ManagedResource(objectName = "annojmx:myjao=AnnotationObject", description = "MyJavaAnnotationObject")
public class HusbandLocal {

    // 属性
    private String name;
    private int    age;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
