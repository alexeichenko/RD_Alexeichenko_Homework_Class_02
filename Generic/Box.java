package Generic;

public class Box <T extends Number> {
    private T item;

    public void addItem(T newItem) {
        this.item = newItem;
    }

    public T getItem() {
        return item;
    }
}
