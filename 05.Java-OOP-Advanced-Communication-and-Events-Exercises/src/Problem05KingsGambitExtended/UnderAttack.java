package Problem05KingsGambitExtended;

import java.util.EventObject;

/**
 * Created by contracts on 2/10/2017.
 */
public class UnderAttack extends EventObject {
    private String name;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public UnderAttack(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String attacked(String attackedObject){
        switch(attackedObject){
            case "King":
                return String.format("King %s is under attack!", this.name);
            case "RoyalGuard":
                return String.format("Royal Guard %s is defending!", this.name);
                default:
                    return String.format("Footman %s is panicking!", this.name);
        }

    }


}
