package problem7DeckOfCards;

/**
 * Created by Radoslav on 9.12.2016 г..
 */
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    private void setSuit(Suit suit) {

        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    private void setRank(Rank rank) {
        this.rank = rank;
    }

    private int GetPower(){
        return this.getRank().GetPower() + this.getSuit().GetPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.getRank(),
                getSuit().toString());
    }
}
