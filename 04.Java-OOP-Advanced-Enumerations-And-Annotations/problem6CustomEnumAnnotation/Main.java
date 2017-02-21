package problem6CustomEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;

/**
 * Created by Radoslav on 9.12.2016 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String input = sc.readLine();

        Cards cards = null;
        switch (input){
            case "Rank":
                Class r = Rank.class;
                cards = (Cards) r.getAnnotation(Cards.class);
                System.out.printf("Type = %s, Description = %s", cards.type(), cards.description());
                break;
            case "Suit":
                Class s = Suit.class;
                cards = (Cards) s.getAnnotation(Cards.class);
                System.out.printf("Type = %s, Description = %s", cards.type(), cards.description());
                break;
        }


    }
}
