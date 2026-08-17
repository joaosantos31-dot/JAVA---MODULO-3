package aula03;

import java.util.Scanner;

public class cond01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        if(num > 0){
            System.out.println("O número é positivo.");
        } else if(num < 0){
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        
        sc.close();
    }
}