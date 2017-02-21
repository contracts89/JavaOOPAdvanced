package problem1GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 5.8.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(sc.readLine());
        GenericBox<String> genericBox = new GenericBox<>();
        for (int i = 0; i < num; i++) {
            genericBox.addItem(sc.readLine());
        }

        System.out.println(genericBox);
    }
}
