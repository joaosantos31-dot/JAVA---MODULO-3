import java.util.Scanner;

public class Wh05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op!=5) {
            System.out.println("\n= = = MENU = = =");
            System.out.println("1 --- CADASTRO -");
            System.out.println("2 --- LISTAR ---");
            System.out.println("3 --- ALTERAR --");
            System.out.println("4 --- REMOVER --");
            System.out.println("5 ---  SAIR  ---");
            System.out.println("ESCOLHA A OPÇÃO: \n");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("cadastrar");
                    break;
                case 2:
                    System.out.println("listar");
                    break;
                case 3:
                    System.out.println("alterar");
                    break;
                case 4:
                    System.out.println("remover");
                    break;
                case 5:
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
