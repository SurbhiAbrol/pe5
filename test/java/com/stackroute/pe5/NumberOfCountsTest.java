package com.stackroute.pe5;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class NumberOfCountsTest {
    NumberOfCounts nc=new NumberOfCounts();
    @Test
    public void stringCount(){
        String s= "one one -one___two,,three,one @three*one?two";
        TreeMap<String,Integer>expected= new TreeMap<>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,nc.stringCount(s));
    }



}