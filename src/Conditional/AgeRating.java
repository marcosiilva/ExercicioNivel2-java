package Conditional;

import java.util.Scanner;

public class AgeRating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Classificador de Idade === ");

        System.out.print("Digite sua idade atual: ");
        int age = sc.nextInt();

        if (age < 0){
            System.out.println("Idade inválida! Digite um número maior ou igual a 0.");
        }
        else if (age <= 12) {
            System.out.println("Criança");
        }
        else if (age <= 17) {
            System.out.println("Adolescente");
        }
        else if (age <= 59) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }
        System.out.println("=== Fim do Programa ===");
        sc.close();
    }
}
