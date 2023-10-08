package org.example;

public class App {

    public String sayHello(){
        return "Hello";
    }

    public String sayHello(String name) {
        if (name == null)
            return "Hello";
        else
            return "Hello " + name;
    }

}
