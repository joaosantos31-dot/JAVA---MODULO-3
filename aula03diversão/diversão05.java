package aula03diversão;

import java.util.Scanner;

public class diversão05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhacorreta = ("Joao1304");
        System.out.print("Digite sua senha de acesso: ");
        String senha = sc.nextLine();
        if (senha.equals(senhacorreta)) {
            System.out.println("Porta aberta.");
        }else{
            System.out.println("Senha não confere.");
        }
        sc.close();
    }
}
