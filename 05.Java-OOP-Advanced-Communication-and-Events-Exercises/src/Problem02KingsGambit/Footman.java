package Problem02KingsGambit;

/**
 * Created by contracts on 1/24/2017.
 */
public class Footman implements Subbordinate {
    private String name;

    public Footman(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void respondToAttack() {
        System.out.println("Footman " + this.getName() + " is panicking!");
    }
}
