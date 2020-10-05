package ADT;

public class Counter {

    private int count = 0;

    private String name;

    Counter(String str) {
        name = str;
    }

    void increment() {
        count++;
    }

    int getCurrentValue() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + getCurrentValue() +
                ", name='" + name + '\'' +
                '}';
    }
}
