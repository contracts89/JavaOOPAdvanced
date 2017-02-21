package foodShortage;

/**
 * Created by Radoslav on 26.7.2016 г..
 */
public class Rebel extends Subbordinate implements IBuyer {
    private String group;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.setGroup(group);
    }

    private String getGroup() {
        return group;
    }

    private void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void buyFood() {
        super.setFoodQuantity(this.getFoodQuantity() + 5);
    }

    @Override
    public int getFoodQuantity() {
        return super.getFoodQuantity();
    }
}
