package Problem01EventImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by contracts on 1/24/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Dispatcher dispatcher = new Dispatcher();
        Handler handler = new Handler();

        dispatcher.addNameChangeListener(handler);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();

            if(input.equals("End")){
                break;
            }

            dispatcher.fireNameChangeEvent(input);
        }
    }
}
