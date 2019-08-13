package com.company.Collections;

import com.company.Resources.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList
{
    public static void main(String[] args)
    {
        Person person1 = new Person(1, "Alan");
        Person person2 = new Person(2, "Barbara");

        List arrayList = new ArrayList();
        addToList(arrayList, 100000);
        addToList(arrayList, person1, 0);
        addToList(arrayList, person1, arrayList.size()/2);
        addToList(arrayList, person2, arrayList.size() - 1);
        readFromList(arrayList);
        deleteFromList(arrayList, 0);
        deleteFromList(arrayList, arrayList.size()/2);
        deleteFromList(arrayList, arrayList.size() - 1);

        List linkedList = new LinkedList();
        addToList(linkedList, 100000);
        addToList(linkedList, person1, 0);
        addToList(linkedList, person2, linkedList.size() - 1);
        readFromList(linkedList);
        deleteFromList(linkedList, 0);
        deleteFromList(linkedList, linkedList.size()/2);
        deleteFromList(linkedList, linkedList.size() - 1);
    }

    private static void readFromList(List<Person> list)
    {
        long before = System.currentTimeMillis();
        for (Person person : list)
        {
            list.get(person.getId());
        }
        long after = System.currentTimeMillis();
        long time = after - before;
        System.out.println("Reading from:" + list.getClass().getName() + "with quantity: " + list.size() + " with time: " + time);
    }

    private static void addToList(List<Person> list, int quantity)
    {
        long before = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++)
        {
            list.add(new Person(i, "Name"));
        }
        long after = System.currentTimeMillis();
        long time = after - before;
        System.out.println("Add to list: " + list.getClass().getName() + " " + quantity + " of items with time: " + time);
    }

    private static void addToList(List<Person> list, Person person, int index)
    {
        long before = System.currentTimeMillis();
        list.add(index, person);
        long after = System.currentTimeMillis();
        long time = after - before;
        System.out.println("Add to list: " + list.getClass().getName() + " with time: " + time + " with index: " + index);
    }

    private static void deleteFromList(List list, int index)
    {
        long before = System.currentTimeMillis();
        list.remove(index);
        long after = System.currentTimeMillis();
        long time = after - before;
        System.out.println("Deleted from the list: " + list.getClass().getName() + " item with index: " + index + " in: " + time);
    }
}