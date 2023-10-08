package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    private App app;

    @Before
    public void setup(){
        app = new App();
    }
    @Test
    public void sayHello() {

        assertEquals("Hello",app.sayHello());
    }

    @Test
    public void sayHelloWithName() {
        assertEquals("Hello World", app.sayHello("World"));
    }


}