package aula04diversaodowhile;
import java.util.Scanner;

public class diversão04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op!=4) {
            System.out.println("\n= = = = MENU = = = =");
            System.out.println("1 --- Mochila Escolar");
            System.out.println("2 --- Mochila de Viagem");
            System.out.println("3 --- Mochila Esportiva");
            System.out.println("4 ---  SAIR  ---");
            System.out.println("ESCOLHA A OPÇÃO: ");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Mochila Escolar:\nCompacta e ideal para estudantes.");
                    break;
                case 2:
                    System.out.println("Mochila de Viagem:\nEspaçosa, ideal para longas jornadas.");
                    break;
                case 3:
                    System.out.println("Mochila Esportiva:\nLeve, resistente e ergonômica.");
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
