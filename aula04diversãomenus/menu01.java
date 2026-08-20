package aula04diversãomenus;
import java.util.Scanner;

public class menu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op!=4) {
            System.out.println("\n= = = = MENU = = = =");
            System.out.println("1 --- CAIXA DE PAPELÃO");
            System.out.println("2 --- SACOLA PLASTICA ");
            System.out.println("3 --- EMBALAGEM DE VIDRO");
            System.out.println("4 ---  SAIR  ---");
            System.out.println("ESCOLHA A OPÇÃO: ");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Caixa de papelão:\nIdeal para transporte e armazenamento.");
                    break;
                case 2:
                    System.out.println("Sacola plástica:\nLeve e prática, mas pouco sustentável.");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro:\nResistente e reutilizável.");
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
