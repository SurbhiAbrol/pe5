package com.stackroute.pe5;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    AarrayList arrayList=new AarrayList();



    @Test
    public void updateArrayList(){
        List<String> expected=Arrays.asList("Kiwi","Grape","Mango","Berry");
        List<String> input=Arrays.asList("Apple","Grape","Melon","Berry");

assertEquals(expected,arrayList.arrayList(input));

    }
    @Test
    public void removeArrayList(){
        List<String> expected= new ArrayList<>();
        List<String> input=Arrays.asList("Kiwi","Grape","Mango","Berry");

        assertEquals(expected,arrayList.arrayList1(input));

    }


}