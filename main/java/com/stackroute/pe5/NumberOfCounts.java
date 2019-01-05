package com.stackroute.pe5;

import java.util.*;
import java.util.TreeMap;

public class NumberOfCounts {
   public  TreeMap<String,Integer>stringCount(String s){
       TreeMap<String,Integer> tm= new TreeMap<>();
       s= "one one -one___two,,three,one @three*one?two";
       String[] s1= s.split("[\\s|\\@|\\-|\\_|\\,|\\*|\\?]+");
       int count=0;
       int count1=0;
       int count2=0;
       for (int i=0;i<s1.length;i++){

           if (s1[i].contains("one")){
               count++;
           }
           else if (s1[i].contains("two")){
               count1++;
           }
           else if (s1[i].contains("three")){
               count2++;

           }
       }
       tm.put("one",count);
       tm.put("two",count1);
       tm.put("three",count2);
       System.out.println(tm);

       return tm;
   }


}