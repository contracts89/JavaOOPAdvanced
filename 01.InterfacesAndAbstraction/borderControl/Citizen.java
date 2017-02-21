package borderControl;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Citizen extends Subbordinate {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        super(id);
        this.setName(name);
        this.setAge(age);
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
}
