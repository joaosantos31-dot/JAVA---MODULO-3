import java.util.Scanner;

public class Dw04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("1 - Iniciar jogo");
            System.out.println("2 - Carregar jogo");
            System.out.println("3 - Configurações");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:");
            op=sc.nextInt();
        switch (op) {
                case 1:
                    System.out.println("Iniciar jogo");
                    break;
                case 2:
                    System.out.println("Carregar jogo");
                    break;
                case 3:
                    System.out.println("Configurações");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("opção inválida!!!");
                    break;
                }
            }while (op!=4);
            sc.close();
    }
}

