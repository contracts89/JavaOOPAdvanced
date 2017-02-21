package problem2GenericBox;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : items) {
            sb.append(String.format("%s: %s%n", item.getClass().getName(), item));
        }

        return sb.toString();
    }
}
