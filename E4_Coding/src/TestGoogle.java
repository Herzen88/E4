import java.util.*;

public class TestGoogle {
    public static void main(String[] args) {
        int[] ar = {2, 6, 4, 1};
        int x = 3;
        System.out.println(Arrays.toString(findPair(ar, x)));
        System.out.println(Arrays.toString(findPairGood(ar, x)));
        System.out.println(Arrays.toString(findPairBest(ar, x)));
    }

    static int[] findPair(int[] ar, int x) {
        int a = 0;
        int b = 0;
        int count = 0;

        while (a + b != x) {
            for (int i = count + 1; i < ar.length; i++) {
                a = ar[count];
                b = ar[i];
                if (a + b == x) return new int[]{count, i};
            }
            count++;
        }
        return null;
    }

    static int[] findPairGood(int[] ar, int x) {
        int a = 0;
        int b = 0;
        Set<Integer> set = new HashSet<>();
        for (int v : ar) {
            set.add(v);
        }

        for (int i = 0; i < ar.length; i++) {
            if (set.contains(x - ar[i]) && x - ar[i] != ar[i]) {
                a = i;
                b = x - ar[i];
                break;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if (b == ar[i]) {
                b = i;
                break;
            }
        }

        return new int[]{a, b};
    }

    static int[] findPairBest(int[] ar, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        int a;
        for (int i = 0; i < ar.length; i++) {
            a = ar[i];
            if (map.keySet().contains(x - a)) {
                return new int[]{map.get(x - a), i};
            } else map.put(a, i);
        }
        return null;
    }
}
