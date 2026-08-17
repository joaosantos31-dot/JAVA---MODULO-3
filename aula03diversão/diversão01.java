package aula03diversão;

import java.util.Scanner;

public class diversão01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        System.out.println("Você digitou: " + numero);
        if (numero>0) {
            System.out.println("O número é positivo.");
        } else if (numero<0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        sc.close();
    }
}
