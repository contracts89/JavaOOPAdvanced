package ferrari;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Ferrari implements Car{
    private static final String CAR_MODEL = "488-Spider";
    private String driverName;

    public Ferrari(String driverName) {
        this.setDriverName(driverName);
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public static String getCarModel() {
        return CAR_MODEL;
    }

    @Override
    public String brake() {
        return "Brakes!";
    }

    @Override
    public String giveGas() {
        return "Zadu6avam sA!";
    }
}
