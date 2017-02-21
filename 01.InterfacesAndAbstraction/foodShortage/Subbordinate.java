package foodShortage;

/**
 * Created by Radoslav on 26.7.2016 г..
 */
public abstract class Subbordinate {
    private String name;
    private int age;
    private int foodQuantity;

    public Subbordinate(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.foodQuantity = 0;
    }

    protected int getFoodQuantity() {
        return foodQuantity;
    }

    protected void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
