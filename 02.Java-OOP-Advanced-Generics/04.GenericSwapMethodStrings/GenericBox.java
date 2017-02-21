package problem4GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radoslav on 5.8.2016 г..
 */
public class GenericBox<T> {
    private List<T> items;

    public GenericBox() {
        this.items = new ArrayList<T>();
    }

    public void addItem(T item){
        this.items.add(item);
    }

    public void swampItems(int indexOne, int indexTwo){
        T firstItem = this.items.get(indexOne);
        T secondItem = this.items.get(indexTwo);
        this.items.set(indexOne, secondItem);
        this.items.set(indexTwo, firstItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : items) {
            sb.append(String.format("%s: %s%n", item.getClass().getName(), item));
        }

        return sb.toString();
    }
}
