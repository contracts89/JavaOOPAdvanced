package militaryElite2.models;

import militaryElite2.contracts.ISpy;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class Spy extends Soldier implements ISpy {
    private String codeNumber;

    public Spy(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    private void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\nCode Number: %s", super.toString(), this.getCodeNumber());
    }
}
