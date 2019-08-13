package com.company.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparator {
    public static void main(String[] args) {
        List arrayList = new ArrayList<String>();
        arrayList.add("Herzeleid");
        arrayList.add("Rosenrot");
        arrayList.add("LIFAD");
        System.out.println(arrayList);
        Collections.sort(arrayList, (String o1, String o2) ->
        {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            else return 0;
        });
        System.out.println(arrayList);
    }
}

//class SortListComparator implements Comparator<String>
//{
//
//    @Override
//    public int compare(String o1, String o2)
//    {
//        if (o1.length() > o2.length())
//        {
//            return 1;
//        }
//        else if (o1.length() < o2.length())
//        {
//            return -1;
//        }
//        else
//            return 0;
//    }
//}
