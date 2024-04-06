import java.util.Arrays;
import java.util.Scanner;

public class SredniaOcenZTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile ocen chcesz wprowadzić dla informatyki? ");
        int[] informatyka = new int[scanner.nextInt()];

        wprowadzIWyswietlOceny(informatyka, scanner, "informatyka");



        double medianaInformatyka = obliczMediane(informatyka);
        System.out.printf("Mediana ocen z informatyki: %.2f\n", medianaInformatyka);
    }

    private static void wprowadzIWyswietlOceny(int[] oceny, Scanner scanner, String przedmiot) {
        System.out.println("Wprowadzanie ocen z " + przedmiot + ":");
        for (int i = 0; i < oceny.length; i++) {
            do {
                System.out.printf("Podaj ocenę nr %d (1-6): ", i + 1);
                oceny[i] = scanner.nextInt();
            } while (oceny[i] < 1 || oceny[i] > 6);
        }
    }

    private static double obliczMediane(int[] oceny) {
        Arrays.sort(oceny);
        if (oceny.length % 2 == 1) {
            return oceny[oceny.length / 2];
        } else {
            return (oceny[oceny.length / 2 - 1] + oceny[oceny.length / 2]) / 2.0;
        }
    }
}
