package ADT;

public class Counter {

    private int counter = 0;
    private String name;

    public Counter(String str) {
        name=str;
    }

    public void increment() {
        counter++;
    }

    public int getCurrentValue() {
        return counter;
    }

    @Override
    public String toString() {
        return "ADT.Counter{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                '}';
    }
}
