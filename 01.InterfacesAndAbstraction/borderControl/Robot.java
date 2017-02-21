package borderControl;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Robot extends Subbordinate {
    private String model;
    private String id;

    public Robot(String model, String id) {
        super(id);
        this.setModel(model);
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }
}
