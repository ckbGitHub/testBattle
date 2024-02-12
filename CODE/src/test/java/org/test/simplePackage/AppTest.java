package org.test.simplePackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest{

    @Test
    public void testApp(){
        App myApp = new App(55);
        myApp.addOne();
        assertEquals("Problem", 56, myApp.getScore());
    }


}
