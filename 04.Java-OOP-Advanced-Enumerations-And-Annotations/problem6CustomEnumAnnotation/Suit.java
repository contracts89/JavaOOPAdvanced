package problem6CustomEnumAnnotation;

/**
 * Created by Radoslav on 9.12.2016 г..
 */
@Cards(type = "Enumeration", category = "Suit", description = "Provides suit constants for a Card class.")
public enum Suit {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int power;

    private Suit(int power){
        this.power = power;
    }

    public int GetPower(){
        return this.power;
    }
}
