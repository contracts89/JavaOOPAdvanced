package militaryElite2.models;


import militaryElite2.contracts.IMission;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class Mission implements IMission {
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    private void setState(String state) {
        if(!state.equals("inProgress") && !state.equals("Finished")){
            throw new IllegalArgumentException("Invalid mission state");
        }
        this.state = state;
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getMissionState() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.getCodeName(), this.getMissionState());
    }
}
