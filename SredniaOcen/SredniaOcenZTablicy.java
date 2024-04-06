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
        
        wprowadzOceny(informatyka, scanner, "informatyka");
        wprowadzOceny(wf, scanner, "wf");
        wprowadzOceny(matematyka, scanner, "matematyka");
        wprowadzOceny(fizyka, scanner, "fizyka");
        wprowadzOceny(polski, scanner, "polski");
        
        double suma = 0;
        int liczbaOcen = informatyka.length + wf.length + matematyka.length + fizyka.length + polski.length;
        
        suma += sumaOcen(informatyka);
        suma += sumaOcen(wf);
        suma += sumaOcen(matematyka);
        suma += sumaOcen(fizyka);
        suma += sumaOcen(polski);
        
        double srednia = suma / liczbaOcen;
        
        System.out.printf("Średnia wszystkich ocen wynosi: %.2f", srednia);
    }
    
    private static void wprowadzOceny(int[] oceny, Scanner scanner, String przedmiot) {
        for (int i = 0; i < oceny.length; i++) {
            System.out.printf("Podaj ocenę nr %d z %s: ", i + 1, przedmiot);
            oceny[i] = scanner.nextInt();
        }
    }
    
    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }
}
