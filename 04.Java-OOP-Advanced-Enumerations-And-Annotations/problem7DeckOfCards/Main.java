package problem7DeckOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radoslav on 9.12.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String input = sc.readLine();
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        List<Card> cards = new ArrayList<>();

        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
