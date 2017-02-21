package birthdayCelebrations;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Citizen extends Subbordinate {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        super(id);
        this.setName(name);
        this.setAge(age);
        this.setBirthDate(birthDate);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("%s", this.getBirthDate());
    }
}
