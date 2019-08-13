package com.company.Collections;

import com.company.Resources.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable
{
    public static void main(String[] args)
    {
        List<Person> arrayList = new ArrayList<Person>();
        arrayList.add(new Person(1,"Herzeleid"));
        arrayList.add(new Person(2,"Rosenrot"));
        arrayList.add(new Person(3,"LIFAD"));
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
