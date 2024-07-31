import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";

    public static void main(String[] args) {
        System.out.print("Введите Ф.И.О: ");
        String input = new Scanner(System.in).nextLine();
        input=input.trim();
        if (input.matches(VALID_REGEX))
            System.out.println(input.replace(" ","\n"));
    }
}