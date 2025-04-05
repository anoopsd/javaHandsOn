package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(System.out::println);
        };
        printWordsLambda.accept("Eda mone kidu");

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length();i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        String result = everySecondCharacter(everySecondChar, "1234567890");
        System.out.println(result);

        Supplier<String> str = () -> new StringBuilder("I Love Java").toString();
        System.out.println(str.get());

        List<String> st = new ArrayList<>(
                List.of("Anoop", "Bob", "Gokul")
        );
        st.replaceAll(String::toUpperCase);
        System.out.println(st);
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length();i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(UnaryOperator<String> t, String s) {
        return t.apply(s);
    }
}
