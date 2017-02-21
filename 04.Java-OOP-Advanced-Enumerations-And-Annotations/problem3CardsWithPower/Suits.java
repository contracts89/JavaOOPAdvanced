package problem3CardsWithPower;

/**
 * Created by Radoslav on 8.12.2016 г..
 */
public enum Suits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int power;

    private Suits(int power){
        this.power = power;
    }

    public int GetPower(){
        return this.power;
    }
}
