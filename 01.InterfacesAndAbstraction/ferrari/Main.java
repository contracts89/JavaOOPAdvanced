package ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException, IllegalClassFormatException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String driverName = sc.readLine();
        Ferrari ferrari = new Ferrari(driverName);

        System.out.printf("%s/%s/%s/%s", ferrari.getCarModel(), ferrari.brake(), ferrari.giveGas(), ferrari.getDriverName());

        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }

    }
}
