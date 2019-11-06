package space.harbour.java.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Slang {
    private static final List<String> abbreviations_key = new ArrayList<>(List.of("PLZ", "FYI", "GTFO", "ASAP"));
    private static final List<String> abbreviations_value = new ArrayList<>(List.of("please", "for your information", "please leave me alone", "as soon as possible"));
    private static final List<String> smilies_key = new ArrayList<>(List.of("\\:\\)", "\\:\\(", "\\¯\\_\\(ツ\\)\\_\\/\\¯"));
    private static final List<String> smilies_value = new ArrayList<>(List.of("[smiling]", "[sad]", "[such is life]"));


    private static String fixAbbreviations(String text) {
        for (int i = 0; i < abbreviations_key.size(); i++) {
            text = text.replaceAll(abbreviations_key.get(i), abbreviations_value.get(i));
        }
        return text;
    }

    private static String fixSmiles(String text) {
        for (int i = 0; i < smilies_key.size(); i++) {
            text = text.replaceAll(smilies_key.get(i), smilies_value.get(i));
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        String text  = input.nextLine();
        text = fixAbbreviations(text);
        text = fixSmiles(text);
        System.out.println(text);
    }
}
