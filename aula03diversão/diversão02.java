package aula03diversão;

import java.util.Scanner;

public class diversão02 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        System.out.println("Você digitou: " + numero);
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
            
        }
        sc.close();
    }
}

