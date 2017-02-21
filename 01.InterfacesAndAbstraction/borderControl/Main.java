package borderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radoslav on 25.7.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        List<String> input = new ArrayList<>();
        List<ISecure> detained = new ArrayList<>();
        while (true){
            //String[] line = sc.readLine().split("\\s+");
            String line = sc.readLine();
            if(line.equals("End")){
                break;
            }
            input.add(line);
        }
        String idToLookFor = sc.readLine();
        Citizen citizen = null;
        Robot robot = null;

        for (String simpleLine : input) {
            String[] tokens = simpleLine.split("\\s+");
            if(tokens.length > 2){
                citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                if(!citizen.checkID(tokens[2], idToLookFor)){
                    detained.add(citizen);
                }
            }else {
                robot = new Robot(tokens[0], tokens[1]);
                if(!robot.checkID(tokens[1], idToLookFor)){
                    detained.add(robot);
                }
            }
        }

        for (ISecure subbordinate : detained) {
            System.out.println(subbordinate);
        }
    }
}
