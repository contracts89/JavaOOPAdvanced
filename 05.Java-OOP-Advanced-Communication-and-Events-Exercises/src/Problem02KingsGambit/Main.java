package Problem02KingsGambit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by contracts on 1/24/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Subbordinate royalGuard;
        Subbordinate footman;

        String line = br.readLine();

        King king = new King(line);

        while(true){
            String[] command = br.readLine().split(" ");

            if(command[0].equalsIgnoreCase("end")){
                break;
            }

            switch (command[0]){
                case "Attack":
                    king.respondToAttack();
                    break;
                case "Kill":
                    String name = command[1];
                    List<Subbordinate> subbordinates = new ArrayList<>(king.getSubbordinates());
                    for (Subbordinate subbordinate : subbordinates) {
                        if(subbordinate.getName().equals(name)){
                            king.killSubbordinate(subbordinate);
                        }
                    }

                    break;
                    default:
                        String[] royalGuardsNames = command;
                        String[] footmenNames = br.readLine().split(" ");

                        for (String royalGuardName : royalGuardsNames) {
                            royalGuard = new RoyalGuard(royalGuardName);
                            king.addSubbordinate(royalGuard);
                        }

                        for (String footmanName : footmenNames) {
                            footman = new Footman(footmanName);
                            king.addSubbordinate(footman);
                        }
            }
        }
    }
}
