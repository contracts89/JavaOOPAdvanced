package foodShortage;

/**
 * Created by Radoslav on 26.7.2016 г..
 */
public class Citizen extends Subbordinate implements IBuyer{
    private String id;
    private String birthdayDate;

    public Citizen(String name, int age, String id, String birthdayDate) {
        super(name, age);
        this.setId(id);
        this.setBirthdayDate(birthdayDate);
    }

    private String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    private String getBirthdayDate() {
        return birthdayDate;
    }

    private void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    @Override
    public void buyFood() {
        super.setFoodQuantity(this.getFoodQuantity() + 10);
    }

    @Override
    public int getFoodQuantity() {
        return super.getFoodQuantity();
    }
}
