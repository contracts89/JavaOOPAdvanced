package problem4CardToString;

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
        Card card = new Card(Rank.valueOf(firstLine), Suit.valueOf(secondLine));
        System.out.println(card.toString());
    }
}
