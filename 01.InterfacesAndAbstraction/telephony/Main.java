package telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = buffReader.readLine().split("\\s+");
        String[] sites = buffReader.readLine().split("\\s+");

        Smartphone smartphone = new Smartphone();

        callNumbers(numbers, smartphone);

        browseWeb(sites, smartphone);

    }

    private static void callNumbers(String[] numbers, Smartphone smartphone) {
        for(String number : numbers){
            try{
                System.out.println(smartphone.call(number));
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
    }

    private static void browseWeb(String[] sites, Smartphone smartphone) {
        for(String site : sites){
            try{
                System.out.println(smartphone.browseWeb(site));
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
    }
}
