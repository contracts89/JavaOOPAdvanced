package Problem02KingsGambit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by contracts on 1/24/2017.
 */
public class King implements Attackable {
    private String name;
    private List<Subbordinate> subbordinates;

    public King(String name){
        this.name = name;
        this.subbordinates = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public List getSubbordinates(){
        return this.subbordinates;
    }

    public void addSubbordinate (Subbordinate subbordinate){
        this.subbordinates.add(subbordinate);
    }

    public void killSubbordinate(Subbordinate subbordinate){
        if(subbordinates.contains(subbordinate)){
            this.subbordinates.remove(subbordinate);
        }
    }

    @Override
    public void respondToAttack() {
        System.out.println("King " + this.getName() + " is under attack!");
        for (Subbordinate subbordinate : subbordinates) {
            subbordinate.respondToAttack();
        }
    }
}
