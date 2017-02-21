package problem8CardGame;

/**
 * Created by Radoslav on 9.12.2016 г..
 */
public enum Suit {
    CLUBS(0), HEARTS(26), DIAMONDS(13), SPADES(39);

    private int power;

    private Suit(int power){
        this.power = power;
    }

    public int GetPower(){
        return this.power;
    }
}
