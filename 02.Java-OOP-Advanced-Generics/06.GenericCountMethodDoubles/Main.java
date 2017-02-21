package problem6GenericCountMethodDoubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 5.8.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        GenericBox genericBox = new GenericBox();
        int num = Integer.parseInt(sc.readLine());
        for (int i = 0; i < num; i++) {
            genericBox.addItem(Double.parseDouble(sc.readLine()));
        }
        Double compareItem = Double.parseDouble(sc.readLine());
        genericBox.returnCount(compareItem, genericBox.getItems());

        System.out.println(genericBox);
    }
}
