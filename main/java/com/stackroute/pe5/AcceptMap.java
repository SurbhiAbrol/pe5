package com.stackroute.pe5;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;

public class AcceptMap {
    public Map<String,String> swapString(HashMap<String,String> input)
    {
        Map<String,String> treemap=new HashMap<>(input);
        if(input.containsKey("val1")&& input.containsKey("val2")) {
            input.replace("val2", "java");
            input.replace("val1", " ");
            System.out.println(input);
            return input;
        }
        else
            return null;
    }

}
