package foodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Radoslav on 26.7.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(sc.readLine());
        HashMap<String, IBuyer> subbordinates = new HashMap<>();
        Citizen citizen = null;
        Rebel rebel = null;

        for (int i = 0; i < num; i++) {
            String[] tokens = sc.readLine().split("\\s+");
            if(tokens.length > 3){
                citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                if(!subbordinates.containsKey(tokens[0])){
                    subbordinates.put(tokens[0], citizen);
                }
            }else {
                rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                if(!subbordinates.containsKey(tokens[0])){
                    subbordinates.put(tokens[0], rebel);
                }
            }
        }

        while (true){
            String name = sc.readLine();
            if(name.equals("End")){
                break;
            }

            for (String subbordinateName : subbordinates.keySet()) {
                if(subbordinateName.equals(name)){
                    subbordinates.get(subbordinateName).buyFood();
                }
            }
        }

        int totalFoodQuantity = 0;
        for (IBuyer iBuyer : subbordinates.values()) {
            totalFoodQuantity += iBuyer.getFoodQuantity();
        }

        System.out.println(totalFoodQuantity);
    }
}
