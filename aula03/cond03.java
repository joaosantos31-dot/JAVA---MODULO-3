package aula03;

import java.util.Scanner;

public class cond03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade=sc.nextInt();
        
        System.out.println("Você é estudante? (1 para sim, 0 para não): ");
        int estudante=sc.nextInt();

        if(idade >= 60 || estudante==1){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        sc.close();
    }
}
