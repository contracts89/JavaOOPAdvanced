package problem8CardGame;

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
        String firstPlayerName = sc.readLine();
        String secondPlayerName = sc.readLine();
        Player firstPlayer = new Player(firstPlayerName);
        Player secondPlayer = new Player(secondPlayerName);
        Rank[] allRanks = Rank.values();
        Suit[] allSuits = Suit.values();
        List<String> dealtCards = new ArrayList<>();

        while (true){
            String[] input = sc.readLine().split(" ");
            String cardRank = input[0];
            String cardSuit = input[2];
            if (!validateCard(allRanks, allSuits, cardRank, cardSuit)){
                System.out.println("No such card exists.");
            }else {
                try{
                    Card card = new Card(Rank.valueOf(cardRank), Suit.valueOf(cardSuit));
                    if(dealtCards.contains(card.toString())){
                        System.out.println("Card is not in the deck.");
                    }else{
                        if(firstPlayer.checkPlayerDeckSize()){
                            firstPlayer.addCardsToDeck(card);
                            dealtCards.add(card.toString());
                        }else {
                            secondPlayer.addCardsToDeck(card);
                            dealtCards.add(card.toString());
                        }
                    }
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }

                if(!firstPlayer.checkPlayerDeckSize() & !secondPlayer.checkPlayerDeckSize()){
                    break;
                }
            }
        }

        Card fistPlayerTopCard = firstPlayer.getTopCard();
        Card secondPlayerTopCard = secondPlayer.getTopCard();

        if(fistPlayerTopCard.GetPower() > secondPlayerTopCard.GetPower()){
            System.out.printf("%s wins with %s.", firstPlayerName, fistPlayerTopCard.toString());
        }else if(secondPlayerTopCard.GetPower() > fistPlayerTopCard.GetPower()){
            System.out.printf("%s wins with %s.", secondPlayerName, secondPlayerTopCard.toString());
        }else {
            System.out.println();
        }
    }

    private static boolean validateCard(Rank[] allRanks, Suit[] allSuits, String cardRank, String cardSuit) {
        for (Suit suit : allSuits) {
            for (Rank rank : allRanks) {
                if(suit.name().equals(cardSuit) && rank.name().equals(cardRank)){
                    return true;
                }
            }
        }
        return false;
    }
}
