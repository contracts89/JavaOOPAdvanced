package problem1GenericBox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radoslav on 5.8.2016 г..
 */
public class GenericBox<T> {
    private List<T> listOfItems;

    public GenericBox() {
        this.listOfItems = new ArrayList<T>();
    }

    public void addItem(T item){
        this.listOfItems.add(item);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T item : this.listOfItems) {
            builder.append(String.format("%s: %s%n", item.getClass().getName(), item));
        }

        return builder.toString();
    }
}
