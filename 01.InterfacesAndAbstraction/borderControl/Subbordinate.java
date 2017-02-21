package borderControl;

/**
 * Created by Radoslav on 26.7.2016 г..
 */
public abstract class Subbordinate implements ISecure {
    private String id;

    public Subbordinate(String id) {
        this.setId(id);
    }

    protected String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean checkID(String id, String idPattern) {
        if(id.endsWith(idPattern)){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%s", this.getId());
    }
}
