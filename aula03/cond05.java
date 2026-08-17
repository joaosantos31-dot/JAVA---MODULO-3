package aula03;

import java.util.Scanner;

public class cond05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        if (nome.equals("Raquel") && senha.equals("1234")) {
            System.out.println("Acesso permitido.");
        }else if (nome.equals("Marcos")&& senha.equals("5678")) {
            System.out.println("Acesso permitido.");
        }else {
            System.out.println("Acesso negado.");
            
        }
        sc.close();
    }
}
