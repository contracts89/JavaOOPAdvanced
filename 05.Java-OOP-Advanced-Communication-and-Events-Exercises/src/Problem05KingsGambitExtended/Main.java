package Problem05KingsGambitExtended;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by contracts on 2/10/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kingName = br.readLine();
        King king = new King(kingName);
        String[] royalGuards = br.readLine().split(" ");
        String[] foormen = br.readLine().split(" ");
        for (String royalGuardName : royalGuards) {
            Subject subject = new RoyalGuard(royalGuardName);
            king.addSubbbodinate(subject);
        }

        for (String foormanName : foormen) {
            Subject subject = new Footman(foormanName);
            king.addSubbbodinate(subject);
        }

        String[] input = br.readLine().split(" ");

        while (true){
            if(input[0].equalsIgnoreCase("end")){
                break;
            }

            switch (input[0]){
                case "Attack":
                    System.out.println(king.underAttack());
                    break;
                case "Kill":
                    String subjectName = input[1];
                    for (Subject subject : king.getSubbodrinates()) {
                        if(subject.getName().equals(subjectName)){
                            subject.getHit();
                        }
                    }
                    break;
            }
            input = br.readLine().split(" ");
        }
    }
}
