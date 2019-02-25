import java.util.*;
import java.util.stream.Collectors;

public class ArrayTask {
    public static void main(String[] args) {
        int[] sequence = {1, 3, 1, 3, 2, 1, 3, 4, 4, 4};
        System.out.println(getMostFrequent(sequence));
    }

    public static Set getMostFrequent(int[] givenArray) {
        List<Integer> listGivenArray = Arrays.stream(givenArray).boxed().collect(Collectors.toList());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < listGivenArray.size(); i++) {
            int k = 0;
            for (int j = 0; j < listGivenArray.size(); j++) {
                if (listGivenArray.get(i) == listGivenArray.get(j)) {
                    k++;
                    map.put(listGivenArray.get(i), k);
                }
            }
        }
        Set listOfMatches = new HashSet();
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
               listOfMatches.add(maxEntry);
            }
            if ((maxEntry != null && entry.getValue().compareTo(maxEntry.getValue()) == 0)) {
                listOfMatches.add(entry);
            }
        }
        return listOfMatches;
    }
}
