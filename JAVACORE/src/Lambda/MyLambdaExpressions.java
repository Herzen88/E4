package com.company.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 10);
        System.out.println(a);
    }
}

public class MyLambdaExpressions {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run((x, y) -> x + y);

        LambdaMethods lambdaMethods = new LambdaMethods();
        lambdaMethods.testMap(generateList());
        lambdaMethods.testForEach(generateList());
        lambdaMethods.testFilter(generateList());
        lambdaMethods.testReduce(generateList());
    }

    private static List generateList() {
        List arrayList = new ArrayList<String>();
        arrayList.add("Herzeleid");
        arrayList.add("Rosenrot");
        arrayList.add("LIFAD");
        return arrayList;
    }
}

class LambdaMethods {
    void testMap(List list) {
        System.out.println(list.stream().map(item -> item = "Rammstein").collect(Collectors.toList()));
    }

    void testForEach(List list) {
        list.stream().forEach(item -> System.out.println(item.toString().length()));
    }

    void testFilter(List list) {
        System.out.println(list.stream().filter(item -> item.toString().contains("r")).collect(Collectors.toList()));
    }

    void testReduce(List list) {
        System.out.println(list.stream().reduce((acc, item) -> acc.toString() + item).get());
    }
}