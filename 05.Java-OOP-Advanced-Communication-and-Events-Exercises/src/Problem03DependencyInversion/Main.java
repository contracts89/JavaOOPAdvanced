package Problem03DependencyInversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by contracts on 1/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrimitiveCalculator primitiveCalculator = new PrimitiveCalculator();
        primitiveCalculator.setFirstCalculation(true);

        String[] line = br.readLine().split(" ");
        while(true){
            if(line[0].equalsIgnoreCase("end")){
                break;
            }else if(line[0].equalsIgnoreCase("mode")){
                char operator = line[1].charAt(0);
                primitiveCalculator.changeStrategy(operator);
                String[] numbers = br.readLine().split(" ");
                int firstNum = Integer.parseInt(numbers[0]);
                int secondNum = Integer.parseInt(numbers[1]);
                System.out.println(primitiveCalculator.performCalculation(firstNum, secondNum));
                primitiveCalculator.setFirstCalculation(false);
            }else {
                if(primitiveCalculator.getIsFirstCalculation()){
                    primitiveCalculator.changeStrategy('+');
                    primitiveCalculator.setFirstCalculation(false);
                }

                String[] numbers = line;
                int firstNum = Integer.parseInt(numbers[0]);
                int secondNum = Integer.parseInt(numbers[1]);
                System.out.println(primitiveCalculator.performCalculation(firstNum, secondNum));
            }
            line = br.readLine().split(" ");
        }
    }
}
