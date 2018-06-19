package com.service.csea.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsea {

        CseaDelegate cseaDelegate = new CseaDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseaDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}