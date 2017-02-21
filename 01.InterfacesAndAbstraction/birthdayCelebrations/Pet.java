package birthdayCelebrations;

/**
 * Created by Radoslav on 26.7.2016 г..
 */
public class Pet implements ISecure {
    private String birthdate;
    private String name;

    public Pet(String name, String birthdate) {
        this.setName(name);
        this.setBirthdate(birthdate);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getBirthdate() {
        return birthdate;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean checkBd(String birthDate, String bdPattern) {
        String[]bdTokens = birthDate.split("/");
        if(bdTokens[2].equals(bdPattern)){
            return false;
        }else {
            return true;
        }
    }

    public String toString() {
        return String.format("%s", this.getBirthdate());
    }
}
