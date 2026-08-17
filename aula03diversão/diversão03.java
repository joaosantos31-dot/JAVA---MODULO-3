package aula03diversão;

import java.util.Scanner;

public class diversão03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade > 0 && idade <= 12) {
            System.out.println("Sua idade é: "+idade);
            System.out.println("Você é criança.");
        }else if (idade>=13 && idade<=17) {
            System.out.println("Sua idade é: "+idade);
            System.out.println("Você é adolecente.");
        }else if (idade>=18 && idade<=59){
            System.out.println("Sua idade é: "+idade);
            System.out.println("Você é adulto.");
        }else{
            System.out.println("Sua idade é: "+idade);
            System.out.println("Você é idoso.");
        }
        sc.close();
    }
}