package com.stackroute.pe5;

import java.util.*;

public class AarrayList {
    List<String> mylist = new ArrayList<>();
    public List<String> arrayList(List<String> list) {

        mylist.add("Apple");
            mylist.add("Grape");
            mylist.add("Melon");
            mylist.add("Berry");
            System.out.println(list);

            mylist.remove(0);
            mylist.add(0,"Kiwi");
            mylist.remove(2);
            mylist.add(2,"Mango");
            System.out.println(mylist);
            return mylist;

        }
        public List<String> arrayList1(List<String> list){
        List<String> mylist1= new ArrayList<>();
        mylist1.clear();
            System.out.println(mylist1);
        return mylist1;
        }
    }