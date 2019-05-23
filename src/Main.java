import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tab = new String[5];

        System.out.println("Wpisz 5 imion:");

        for (int i = 0; i < 5; i++) {

            tab[i] = scan.nextLine();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.printf("Cześć %s:\n", tab[i]);

        }


    }
}
