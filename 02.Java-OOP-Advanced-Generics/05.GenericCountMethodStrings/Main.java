package problem5GenericCountMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 5.8.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        GenericBox box = new GenericBox();
        int num = Integer.parseInt(sc.readLine());
        for (int i = 0; i < num; i++) {
            box.addItem(sc.readLine());
        }
        String compareItem = sc.readLine();
        box.returnCount(compareItem, box.getItems());

        System.out.println(box);
    }
}
