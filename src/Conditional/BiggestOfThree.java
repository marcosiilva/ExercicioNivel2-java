package Conditional;

import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificador de número maior ===");

        System.out.print("Digite o primeiro número: ");
        int number1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int number2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " é o maior número dos três");
        }
        else if (number2 > number3) {
            System.out.println(number2 + " é o maior número dos três");
        }
        else {
            System.out.println(number3 + " é o maior número dos três");
        }

        System.out.println("=== Fim do Programa ===");
        sc.close();
    }
}
