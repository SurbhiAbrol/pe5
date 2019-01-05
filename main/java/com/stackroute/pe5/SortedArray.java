package com.stackroute.pe5;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortedArray {

    public static Set<String> Ascending(List<String> list)
    {
        TreeSet<String> treeset=new TreeSet<String>(list);
        Iterator<String> itr=treeset.iterator();
        itr.next();
        System.out.println(list);
        return treeset;
    }
    public  List<String> convertList(TreeSet<String> tset)
    {
        List<String> arraylist=new ArrayList<String>(tset);
    Iterator<String> itr=arraylist.iterator();
        System.out.println(tset);
    return arraylist;
    }

}
