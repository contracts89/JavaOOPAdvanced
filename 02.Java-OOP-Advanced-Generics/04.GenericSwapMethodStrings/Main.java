package problem4GenericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Radoslav on 5.8.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(sc.readLine());
        GenericBox genericBox = new GenericBox();
        for (int i = 0; i < num; i++) {
            genericBox.addItem(Integer.parseInt(sc.readLine()));
        }

        int[] nums = Arrays.stream(sc.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int firstIndex = nums[0];
        int secondIndex = nums[1];
        genericBox.swampItems(firstIndex, secondIndex);

        System.out.println(genericBox);
    }
}
