package Conditional;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Identificador de Par ou Ímpar ===");

        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número " + number + " é Par!");
        }
        else {
            System.out.println("O número " + number + " é Ímpar!");
        }

        System.out.println("=== Fim do Programa === ");
        sc.close();


    }
}
