package com.company.Collections;

import com.company.Resources.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap
{
    public static void main(String[] args)
    {
        Person person1 = new Person(3,"Joe");
        Person person2 = new Person(2,"Kate");
        Person person3 = new Person(1,"Lily");
        Map hashMap = new HashMap<Integer, String>();
        addItemToMap(hashMap,person1);
        addItemToMap(hashMap,person2);
        addItemToMap(hashMap,person3);
        deleteItemFromMap(hashMap,person2);
        Map treeMap = new TreeMap<Integer, String>();
        addItemToMap(treeMap,person1);
        addItemToMap(treeMap,person2);
        addItemToMap(treeMap,person3);
        deleteItemFromMap(treeMap,person2);
    }

    private static void addItemToMap(Map map, Person person){
        map.put(person.getId(), person);
        System.out.println(map);
    }

    private static void deleteItemFromMap(Map map, Person person){
        map.remove(person.getId());
        System.out.println(map);
    }
}

