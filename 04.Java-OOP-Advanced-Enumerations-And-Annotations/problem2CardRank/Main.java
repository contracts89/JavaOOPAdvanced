package problem2CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 8.12.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Cards[] deck = Cards.values();
        String input = sc.readLine();
        if(input.equals("Card Ranks")){
            System.out.println("Card Ranks:");
            for (Cards card : deck) {
                System.out.println("Ordinal value: "+card.ordinal()+"; Name value: "+card.name());
            }
        }
    }
}
