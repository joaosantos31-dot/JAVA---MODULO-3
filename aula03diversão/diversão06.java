package aula03diversão;

import java.util.Scanner;

public class diversão06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        if (operador == '+') {
            System.out.println("Equação: " + num1 +" "+ operador +" "+ num2);
            System.out.println("Resultado: " + (num1 + num2));
        } else if (operador == '-') {
            System.out.println("Equação: " + num1 +" "+ operador +" "+ num2);
            System.out.println("Resultado: " + (num1 - num2));
        } else if (operador == '*') {
            System.out.println("Equação: " + num1 +" "+ operador +" "+ num2);
            System.out.println("Resultado: " + (num1 * num2));
        } else if (operador == '/') {
            if (num2 != 0) {
                System.out.println("Equação: " + num1 +" "+ operador +" "+ num2);
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: Divisão por zero não é permitida!");
            }
        } else {
            System.out.println("Operador inválido!");
        }

        scanner.close();
    }
}