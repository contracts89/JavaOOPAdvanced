package Problem05KingsGambitExtended;

/**
 * Created by contracts on 2/10/2017.
 */
public class Footman implements Subject {
    private String name;
    private int takenHits;
    private boolean isKileed;

    public Footman(String name) {
        this.name = name;
        this.takenHits = 0;
        this.isKileed = false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String underAttack() {
        UnderAttack underAttack = new UnderAttack(this, this.getName());
        return underAttack.attacked(this.getClass().getSimpleName());
    }

    public void getHit(){
        this.setTakenHits(this.getTakenHits() + 1);
        if(this.getTakenHits() == 2){
            this.isKileed = true;
        }
    }

    @Override
    public boolean Killed() {
        return this.isKileed;
    }

    private int getTakenHits() {
        return takenHits;
    }

    private void setTakenHits(int takenHits) {
        this.takenHits = takenHits;
    }
}
