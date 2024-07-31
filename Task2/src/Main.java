import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "The deadliest virus in modern history, perhaps of all time, was the 1918 Spanish Flu. It killed about 20 to 50 million people worldwide, perhaps more. The total death toll is unknown because medical records were not kept in many areas.\n" +
                "\n" +
                "The pandemic hit during World War I and devastated military troops. In the United States, for instance, more servicemen were killed from the flu than from the war itself. The Spanish flu was fatal to a higher proportion of young adults than most flu viruses.\n" +
                "\n" +
                "The pandemic started mildly, in the spring of 1918, but was followed by a much more severe wave in the fall of 1918. The war likely contributed to the devastating mortality numbers, as large outbreaks occurred in military forces living in close quarters. Poor nutrition and the unsanitary conditions of war camps had an effect.";
        System.out.println();
        System.out.println(getWords(input));

    }

    public static String getWords(String s){
        String[] arstr = s.replaceAll("[0-9,.;= \n]+"," ").split(" ");
        String str = "";
        for (int i=0; i< arstr.length-1; i++) {
            str += arstr[i] + "\n";
        }
        str +=arstr[arstr.length-1];
            return str;
    }
}