package problem3CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 8.12.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = sc.readLine();
        String secondLine = sc.readLine();
        Ranks rank = Ranks.valueOf(firstLine);
        Suits suit = Suits.valueOf(secondLine);
        int power = Ranks.valueOf(firstLine).GetPower() + Suits.valueOf(secondLine).GetPower();
        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, power);
    }
}
