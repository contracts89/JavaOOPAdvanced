package problem8CardGame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radoslav on 9.12.2016 г..
 */
public class Player {
    private static Integer PLAYER_DECK_SIZE = 5;
    private String name;
    List<Card> playerCards;

    public Player(String name) {
        this.name = name;
        this.playerCards = new ArrayList<>();
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    private void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public void addCardsToDeck(Card card){
        this.getPlayerCards().add(card);
    }

    public boolean checkPlayerDeckSize(){
        if(this.getPlayerCards().size() < PLAYER_DECK_SIZE){
            return true;
        }else {
            return false;
        }
    }

    public Card getTopCard() {
        Card currentCard = getPlayerCards().get(0);

        for (Card card1 : getPlayerCards()) {
            if(card1.GetPower() > currentCard.GetPower()){
                currentCard = card1;
            }
        }
        return currentCard;
    }
}
