package aula04diversãorepetitiva;

import java.util.Scanner;

public class diversão02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                System.out.println("Você digitou: " + numero);
            }
        } while (numero >= 0);

        System.out.println("Atividade encerrada!!!");
        sc.close();
    }
}