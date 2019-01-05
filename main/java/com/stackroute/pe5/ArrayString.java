package com.stackroute.pe5;
import java.util.TreeMap;

public class ArrayString {
    public TreeMap<String,Boolean>String1(String str[]){
        TreeMap<String,Boolean>tm= new TreeMap<>();

        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i=0;i<str.length;i++){
            if (str[i].contains("a")){
                count++;
            }
            else if (str[i].contains("b")){
                count1++;
            }
            else if(str[i].contains("c")){
                count2++;
            }
            else if(str[i].contains("d"))
            {
                count3++;
            }
        }
        if(count>1)
           tm.put("a",true);
        else
            tm.put("a",false);
        if(count1>1)
            tm.put("b",true);
        else
            tm.put("b",false);
        if(count2>1)
        tm.put("c",true);
        else
            tm.put("c",false);
        if(count3>1)
            tm.put("d",true);
        else
            tm.put("d",false);

        System.out.println(tm);
        return tm;


    }
}
