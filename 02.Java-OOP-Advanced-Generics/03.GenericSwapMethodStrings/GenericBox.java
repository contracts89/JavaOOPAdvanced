package problem3GenericSwapMethodStrings;

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

    public void addItems(T item){
        this.items.add(item);
    }

    public void swamp(int index1, int index2){
        T elementOne = this.items.get(index1);
        T elementTwo = this.items.get(index2);
        this.items.set(index1, elementTwo);
        this.items.set(index2, elementOne);
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
