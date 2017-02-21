package militaryElite2.contracts;


import java.util.Collection;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public interface ICommando extends ISpecializedSoldier {
    Collection<IMission> getMissions();
}
