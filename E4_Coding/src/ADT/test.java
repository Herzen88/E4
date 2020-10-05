package ADT;

public class test {
    public static void main(String[] args) {
        Counter counter = new Counter("Event");
        counter.increment();
        counter.increment();
        System.out.println(counter.toString());
    }
}
