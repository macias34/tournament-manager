import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static int getMenuOption() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> optionsSet = new HashSet<>(Set.of(1, 2, 3));
        System.out.println("""
                1. Modify players list
                2. Display scoreboard
                3. Exit
                """);

        int option = 0;

        do {
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
            }

            if (!optionsSet.contains(option)) {
                System.out.println("Please choose correct option.");
            }

        } while (!optionsSet.contains(option));

        scanner.close();
        return option;
    }

    public static void main(String[] args) throws Exception {
        Tournament tournament = new Tournament();
        int option = getMenuOption();

        switch (option) {
            case 1 -> tournament.modifyPlayersList();
        }
    }
}
