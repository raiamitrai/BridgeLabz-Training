package Day1.CamelCase;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if (input.isEmpty()) {
                continue;
            }

            String[] parts = input.split(";");
            String operation = parts[0];
            String type = parts[1];
            String text = parts[2];

            if (operation.equals("S")) {

                if (type.equals("M")) {
                    text = text.replace("()", "");
                }

                StringBuilder result = new StringBuilder();

                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);

                    if (Character.isUpperCase(ch)) {
                        result.append(" ");
                        result.append(Character.toLowerCase(ch));
                    } else {
                        result.append(ch);
                    }
                }

                System.out.println(result.toString().trim());

            } else {
                String[] words = text.split(" ");
                StringBuilder result = new StringBuilder();

                if (type.equals("C")) {

                    for (String word : words) {
                        result.append(Character.toUpperCase(word.charAt(0)));
                        result.append(word.substring(1));
                    }
                } else {

                    result.append(words[0]);

                    for (int i = 1; i < words.length; i++) {
                        result.append(Character.toUpperCase(words[i].charAt(0)));
                        result.append(words[i].substring(1));
                    }

                    if (type.equals("M")) {
                        result.append("()");
                    }
                }

                System.out.println(result);
            }
        }


    }
}

