package problem8CardGame;

import java.util.List;

/**
 * Created by Radoslav on 9.12.2016 г..
 */
public class Card {
    private Suit suit;
    private Rank rank;
    private Suit[] suits;
    private Rank[] ranks;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
        this.suits = new Suit[Suit.values().length];
        this.ranks = new Rank[Rank.values().length];
    }

    private void setSuits(Suit[] suits){
        this.suits = Suit.values();
    }

    private Suit[] getSuits(){
        return this.suits;
    }

    private void setRanks(Rank[] ranks){
        this.ranks = Rank.values();
    }

    private Rank[] getRanks(){
        return this.ranks;
    }

    public Suit getSuit() {
        return suit;
    }

    private void setSuit(Suit suit) {
        for (Suit suit1 : getSuits()) {
            if(!suit.name().equals(suit1.name())){
                throw new IllegalArgumentException("No such card exists.");
            }else {
                this.suit = suit;
            }
        }
    }

    public Rank getRank() {
        return rank;
    }

    private void setRank(Rank rank) {
        for (Rank rank1 : getRanks()) {
            if(!rank.name().equals(rank1.name())){
                throw new IllegalArgumentException("No such card exists.");
            }else {
                this.rank = rank;
            }
        }
    }

    public int GetPower(){
        return this.getRank().GetPower() + this.getSuit().GetPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.getRank().name(), this.getSuit().name());
    }
}
