import java.util.Scanner;

public class SredniaOcenZTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ile ocen chcesz wprowadzić dla informatyki? ");
        int[] informatyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla wf? ");
        int[] wf = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla matematyki? ");
        int[] matematyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla fizyki? ");
        int[] fizyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla polskiego? ");
        int[] polski = new int[scanner.nextInt()];
        
        wprowadzIWyswietlOceny(informatyka, scanner, "informatyka");
        wprowadzIWyswietlOceny(wf, scanner, "wf");
        wprowadzIWyswietlOceny(matematyka, scanner, "matematyka");
        wprowadzIWyswietlOceny(fizyka, scanner, "fizyka");
        wprowadzIWyswietlOceny(polski, scanner, "polski");
        
        double suma = sumaOcen(informatyka) + sumaOcen(wf) + sumaOcen(matematyka) + sumaOcen(fizyka) + sumaOcen(polski);
        int liczbaOcen = informatyka.length + wf.length + matematyka.length + fizyka.length + polski.length;
        double srednia = suma / liczbaOcen;
        
        System.out.printf("Średnia wszystkich ocen wynosi: %.2f\n", srednia);
    }
    
    private static void wprowadzIWyswietlOceny(int[] oceny, Scanner scanner, String przedmiot) {
        int suma = 0;
        System.out.println("Wprowadzanie ocen z " + przedmiot + ":");
        for (int i = 0; i < oceny.length; i++) {
            System.out.printf("Podaj ocenę nr %d: ", i + 1);
            oceny[i] = scanner.nextInt();
            suma += oceny[i];
        }
        
        System.out.print("Wprowadzone oceny z " + przedmiot + ": ");
        for (int ocena : oceny) {
            System.out.print(ocena + " ");
        }
        System.out.println("\nSuma ocen z " + przedmiot + ": " + suma);
        System.out.printf("Średnia ocen z %s: %.2f\n\n", przedmiot, suma / (double)oceny.length);
    }
    
    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }
}
