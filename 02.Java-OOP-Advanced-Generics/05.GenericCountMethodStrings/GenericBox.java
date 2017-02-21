package problem5GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radoslav on 5.8.2016 г..
 */
public class GenericBox<T extends Comparable<T>>  {
    private List<T> items;
    private int count;

    public GenericBox() {
        this.items = new ArrayList<T>();
        this.count = 0;
    }

    public List<T> getItems() {
        return items;
    }

    public void addItem(T item){
        this.items.add(item);
    }

    public <T extends Comparable<T>> int returnCount(T element, List<T> itemsList){

        for (T item : itemsList) {
            if(item.compareTo(element) > 0){
                this.count++;
            }
        }
        return this.count;
    }

    @Override
    public String toString() {
        return String.format("%d", this.count);
    }
}
