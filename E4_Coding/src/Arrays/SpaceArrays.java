package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SpaceArrays {
    public static void main(String[] args) {
        String[] input = {"abv", "ddv", "ew", "", "dsfsfaaf", "1111", "abv"};
        String[] query = {"abv", "ee", "ew", "", "lolll"};
        Arrays.stream(compare(input, query)).forEach(System.out::println);
        System.out.println(compareGood(input, query).toString());
    }

    public static int[] compare(String[] input, String[] query) {
        int[] result = new int[query.length];
        int count;

        for (int i = 0; i < query.length; i++) {
            count = 0;
            for (int j = 0; j < input.length; j++) {
                if (query[i].equals(input[j])) count++;
            }
            result[i] = count;
        }
        return result;
    }

    public static Map<String, Integer> compareGood(String[] input, String[] query) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < query.length; i++) {
            map.put(query[i], 0);
        }

        for (int i = 0; i < input.length; i++) {
              if(map.containsKey(input[i]))map.put(input[i], map.get(input[i])+1);
        }

        return map;
    }
}
