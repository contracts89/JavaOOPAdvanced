package militaryElite2;

import militaryElite2.contracts.IMission;
import militaryElite2.contracts.IPrivate;
import militaryElite2.contracts.IRepair;
import militaryElite2.contracts.ISoldier;
import militaryElite2.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Map<String, IPrivate> privates = new LinkedHashMap<>();
        List<ISoldier> soldiers = new LinkedList<>();
        while (true) {
            String[] tokens = sc.readLine().split("\\s+");
            if (tokens[0].equals("End")) {
                break;
            }

            String id = tokens[1];
            String fistName = tokens[2];
            String lastName = tokens[3];
            double salary = Double.parseDouble(tokens[4]);
            switch (tokens[0]) {
                case "Private":
                    IPrivate privateSoldier = new Private(id, fistName, lastName, salary);
                    privates.put(id, privateSoldier);
                    soldiers.add(privateSoldier);
                    break;
                case "Spy":
                    String spyCodeNumber = tokens[4];
                    ISoldier spy = new Spy(id, fistName, lastName, spyCodeNumber);
                    soldiers.add(spy);
                    break;
                case "Commando":
                    String commandoCorps = tokens[5];
                    List<IMission> missions = new LinkedList<>();
                    for (int i = 6; i < tokens.length; i += 2) {
                        try{
                            String missionName = tokens[i];
                            String missionState = tokens[i + 1];
                            IMission mission = new Mission(missionName, missionState);
                            missions.add(mission);
                        }catch (IllegalArgumentException ex){
                            //invalid
                        }

                    }
                    try {
                        ISoldier commando = new Commando(id, fistName, lastName, salary, commandoCorps, missions);
                        soldiers.add(commando);
                    } catch (IllegalArgumentException ex) {
                        //invalid
                    }

                    break;
                case "Engineer":
                    String engineerCorps = tokens[5];
                    List<IRepair> repairs = new LinkedList<>();
                    for (int i = 6; i < tokens.length; i += 2) {
                        String partName = tokens[i];
                        int workedHouds = Integer.parseInt(tokens[i + 1]);
                        IRepair repair = new Repair(partName, workedHouds);
                        repairs.add(repair);
                    }
                    try {
                        ISoldier engineer = new Engineer(id, fistName, lastName, salary, engineerCorps, repairs);
                        soldiers.add(engineer);
                    } catch (IllegalArgumentException ex) {
                        //invalid
                    }

                    break;
                case "LeutenantGeneral":
                    List<IPrivate> generalsPrivates = new LinkedList<>();
                    for (int i = 5; i < tokens.length; i++) {
                        String privateId = tokens[i];
                        for (String ids : privates.keySet()) {
                            if (ids.equals(privateId)) {
                                generalsPrivates.add(privates.get(ids));
                            }
                        }
                    }

                    ISoldier leutenantGeneral = new LeutenantGeneral(id, fistName, lastName, salary, generalsPrivates);
                    soldiers.add(leutenantGeneral);
                    break;
            }
        }

        for (ISoldier soldier : soldiers) {
            System.out.println(soldier);
        }
    }
}
