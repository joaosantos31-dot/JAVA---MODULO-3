package aula04diversãomenus;
import java.util.Scanner;

public class menu02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op!=4) {
            System.out.println("\n= = = = MENU = = = =");
            System.out.println("1 --- Caneta Esferográfica");
            System.out.println("2 --- Caneta Gel ");
            System.out.println("3 --- Caneta Tinteiro");
            System.out.println("4 ---  SAIR  ---");
            System.out.println("ESCOLHA A OPÇÃO: ");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Caneta Esferográfica:\nEconômica e de longa duração.");
                    break;
                case 2:
                    System.out.println("Caneta Gel:\nTinta mais pigmentada e escrita suave.");
                    break;
                case 3:
                    System.out.println("Caneta Tinteiro:\nClássica e elegante, usada para caligrafia.");
                    break;
                case 4:
                    System.out.println("sair");
                    break;
                    
                default:
                    System.out.println("opção inválida!!!");
                    break;
            }
        }
        sc.close();
    }
}
