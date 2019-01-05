package com.stackroute.pe5;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;


public class ArrayStringTest {
    ArrayString arrayString=new ArrayString();
    @Test
    public void String1(){
        String [] str= {"a","b","c","d","a","c","c"};
        TreeMap<String,Boolean>expected= new TreeMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        assertEquals(expected,arrayString.String1(str));
    }


}