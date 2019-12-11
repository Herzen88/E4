package GOV.Decorator;

public abstract class TestDecorator{
    public static void main(String[] args) {
        ChristmasTree tree = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree.decorate());
    }
}
