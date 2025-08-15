package Conditional;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificador de ano Bissexto ===");

        System.out.print("Digite um ano: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("O ano de " + year + " é Bissexto");
        }
        else {
            System.out.println("O ano de " + year + " é NÃO é BISSEXTO");
        }

        System.out.println("=== Fim do Programa ===");
        sc.close();

    }
}
