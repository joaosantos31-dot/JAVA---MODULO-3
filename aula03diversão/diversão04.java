package aula03diversão;

import java.util.Scanner;

public class diversão04 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.println("Sua idade é: "+idade);
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Sua idade é: "+idade);
            System.out.println("Você é menor de idade.");
        }
        sc.close();
        }
}
