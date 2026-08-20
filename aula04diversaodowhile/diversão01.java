package aula04diversaodowhile;

import java.util.Scanner;

public class diversão01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";

        while (!senha.equals("2024")) {
            System.out.println("Informe a senha: ");
            senha=sc.nextLine();
        }
        System.out.println("Acesso permitido!!!");
        sc.close();
    }
}
