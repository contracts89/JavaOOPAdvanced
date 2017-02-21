package problem5CardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 8.12.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = new String[2];
        for (int i = 0; i < 2; i++) {
            firstLine[i] = sc.readLine();
        }
        String[] secondLine = new String[2];
        for (int i = 0; i < 2; i++) {
            secondLine[i] = sc.readLine();
        }

        Card firstCard = new Card(Rank.valueOf(firstLine[0]), Suit.valueOf(firstLine[1]));
        Card secondCard = new Card(Rank.valueOf(secondLine[0]), Suit.valueOf(secondLine[1]));

        int result = firstCard.compareTo(secondCard);

        if(result == 1){
            System.out.println(firstCard.toString());
        }else {
            System.out.println(secondCard.toString());
        }
    }
}
