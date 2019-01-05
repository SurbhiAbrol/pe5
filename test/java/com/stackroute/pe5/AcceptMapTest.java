package com.stackroute.pe5;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class AcceptMapTest {
    AcceptMap am=new AcceptMap();

    @Test
    public void swapString(){
        Map<String,String> input=new HashMap<>();
        input.put("val1","java");
        input.put("val2","c++");
        Map<String,String> output=new HashMap<>();
        output.put("val1"," ");
        output.put("val2","java");
        assertEquals(output,am.swapString((HashMap<String, String>) input));
    }
}