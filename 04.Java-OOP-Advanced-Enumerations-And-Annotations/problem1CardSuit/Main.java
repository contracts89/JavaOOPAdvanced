package problem1CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 8.12.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String input = sc.readLine();
        while(true){
            if(!input.contains("Card Suits")){
                break;
            }
            Cards[] cards = Cards.values();
            System.out.println("Card Suits:");
            for (Cards card : cards) {
                System.out.println("Ordinal value: " + card.ordinal()+ "; Name value: "+ card.name());
            }
            break;
        }

    }
}
