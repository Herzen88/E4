package Decorator;

public abstract class TreeDecorator implements ChristmasTree {
    protected ChristmasTree tree;

    public TreeDecorator(ChristmasTree t){
        this.tree=t;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
