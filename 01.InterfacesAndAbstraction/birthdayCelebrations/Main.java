package birthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radoslav on 26.7.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        List<String> input = new ArrayList<>();
        List<ISecure> detained = new ArrayList<>();
        while (true){
            String line = sc.readLine();
            if(line.equals("End")){
                break;
            }
            input.add(line);
        }
        String bdToLookFor = sc.readLine();
        Citizen citizen = null;
        Robot robot = null;
        Pet pet = null;

        for (String simpleLine : input) {
            String[] tokens = simpleLine.split("\\s+");
            switch (tokens[0]){
                case "Citizen":
                    citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    if(!citizen.checkBd(tokens[4], bdToLookFor)){
                        detained.add(citizen);
                    }
                    break;
                case "Robot":
                    robot = new Robot(tokens[1], tokens[2]);
                    //if(!robot.checkBd(tokens[2], bdToLookFor)){
                    //    detained.add(robot);
                    //}
                    break;
                case "Pet":
                    pet = new Pet(tokens[1], tokens[2]);
                    if(!pet.checkBd(tokens[2], bdToLookFor)){
                        detained.add(pet);
                    }
                    break;
            }
        }

        for (ISecure subbordinate : detained) {
            System.out.println(subbordinate);
        }
    }
}
