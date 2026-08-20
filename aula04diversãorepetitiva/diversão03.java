package aula04diversãorepetitiva;

import java.util.Scanner;

public class diversão03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";

        while (!senha.equals("Anderson")) {
            System.out.println("Digite o nome do professor mais fofo do senai:");
            senha=sc.nextLine();
        }
        System.out.println("Acesso permitido!!!");
        sc.close();
    }
}
