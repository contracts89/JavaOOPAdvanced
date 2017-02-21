package Problem02KingsGambit;

/**
 * Created by contracts on 1/24/2017.
 */
public class RoyalGuard implements Subbordinate {
    private String name;

    public RoyalGuard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void respondToAttack() {
        System.out.println("Royal Guard " + this.getName() + " is defending!");
    }
}
