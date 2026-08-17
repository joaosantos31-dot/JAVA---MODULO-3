package aula03diversão;

import java.util.Scanner;

public class diversão07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("(Verde, Azul, Amarelo ou Vermelho)");
        System.out.print("Digite a cor associada ao CD: ");
        String cor = sc.next();

        if (cor.equals("Verde")) {
            System.out.println("O CD tipo Verde.");
            System.out.println("Custa R$ 10.00 .");
        } else if (cor.equals("Azul")) {
            System.out.println("O CD tipo Azul.");
            System.out.println("Custa R$ 20.00 .");
        } else if (cor.equals("Amarelo")) {
            System.out.println("O CD tipo Amarelo.");
            System.out.println("Custa R$ 30.00 .");
        } else if (cor.equals("Vermelho")) {
            System.out.println("O CD tipo Vermelho.");
            System.out.println("Custa R$ 40.00 .");
        } else {
            System.out.println("Cor inválida!");
        }
        sc.close();
    }
}