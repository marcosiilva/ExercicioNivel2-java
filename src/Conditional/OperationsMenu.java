package Conditional;

import java.util.Scanner;

public class OperationsMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu de Operações ===");

        System.out.print("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double number2 = sc.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        double total;

        switch (operation) {
            case '+':
                total = number1 + number2;
                System.out.println("Resultado: " + total);
                break;
            case '-':
                total = number1 - number2;
                System.out.println("Resultado: " + total);
                break;
            case '*':
                total = number1 * number2;
                System.out.println("Resultado: " + total);
                break;
            case '/':
                if (number2 != 0) {
                    total = number1 / number2;
                    System.out.println("Resultado: " + total);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        System.out.println("=== Fim do Programa ===");
        sc.close();
    }
}
