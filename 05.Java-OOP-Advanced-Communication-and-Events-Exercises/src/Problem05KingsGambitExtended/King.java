package Problem05KingsGambitExtended;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by contracts on 2/10/2017.
 */
public class King implements Subject {
    private String name;
    private List<Subject> subbodrinates;

    public King(String name) {
        this.name = name;
        this.subbodrinates = new ArrayList<>();
    }

    private void thinTheHurd(){
        List<Subject> readyForKilling = new ArrayList<>();
        for (Subject subbodrinate : subbodrinates) {
            if(subbodrinate.Killed()){
                readyForKilling.add(subbodrinate);
            }
        }

        for (Subject subject : readyForKilling) {
            this.removeSubbordinate(subject);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String underAttack() {
        UnderAttack underAttack = new UnderAttack(this, this.name);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(underAttack.attacked(this.getClass().getSimpleName()));
        this.thinTheHurd();
        for (Subject subbodrinate : subbodrinates) {
            UnderAttack subbordinateAttack = new UnderAttack(subbodrinate, subbodrinate.getName());
            stringBuilder.append("\n" + subbordinateAttack.attacked(subbodrinate.getClass().getSimpleName()));
        }
        return stringBuilder.toString();
    }

    @Override
    public void getHit() {

    }

    @Override
    public boolean Killed() {
        return false;
    }

    public List<Subject> getSubbodrinates() {
        return this.subbodrinates;
    }

    public void addSubbbodinate(Subject subbordinate){
        this.subbodrinates.add(subbordinate);
    }

    public void removeSubbordinate(Subject subbordinate){
        this.subbodrinates.remove(subbordinate);
    }
}
