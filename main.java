import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int informatyka, wf, matematyka, fizyka, polski;

        System.out.print("Podaj ocenę z informatyki: ");
        informatyka = scanner.nextInt();

        System.out.print("Podaj ocenę z wf: ");
        wf = scanner.nextInt();

        System.out.print("Podaj ocenę z matematyki: ");
        matematyka = scanner.nextInt();

        System.out.print("Podaj ocenę z fizyki: ");
        fizyka = scanner.nextInt();

        System.out.print("Podaj ocenę z polskiego: ");
        polski = scanner.nextInt();

        double srednia = (informatyka + wf + matematyka + fizyka + polski) / 5.0;

        System.out.printf("Średnia ocen wynosi: %.2f", srednia);
    }
}
