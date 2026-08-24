package aula05diversão;

import java.util.Scanner;

public class aula05diversão06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";

        // O loop continua até o usuário digitar "sair"
        while (!entrada.equalsIgnoreCase("sair")) {
            System.out.println("\nInforme um número para a tabuada (ou digite 'sair' para encerrar): ");
            entrada = sc.next();

            // Verifica se a entrada NÃO é a palavra "sair"
            if (!entrada.equalsIgnoreCase("sair")) {
                int numero = Integer.parseInt(entrada);

                // Tabuada
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " X " + i + " = " + (numero * i));
                }

                // Contagem regressiva
                System.out.println("Contagem regressiva:");
                for (int i = 10; i >= 1; i--) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("Programa encerrado!");
        sc.close();
    }
}
