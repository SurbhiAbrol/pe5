package com.stackroute.pe5;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SortedArrayTest {

    @Test
    public void testCase1()
    {
        List<String> li=new ArrayList<String>(Arrays.asList("Harry","Olive","Alice","Bluto","Eugine"));
    TreeSet<String> ts=new TreeSet<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
    assertEquals(ts,new SortedArray().Ascending(li));
    }
    @Test
    public void testCase2()
    {
        TreeSet<String> ts=new TreeSet<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
        List<String> li=new ArrayList<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));
    assertEquals(li,new SortedArray().convertList(ts));
    }



    }

