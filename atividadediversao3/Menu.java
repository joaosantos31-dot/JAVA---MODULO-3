package atividadediversao3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        int quantidade = 0;
        double valorFinal = 0;

        while (true) {
            System.out.println("\n--- SISTEMA DE VENDAS ---");
            System.out.println("1. Cadastrar Produto Físico");
            System.out.println("2. Cadastrar Produto Digital");
            System.out.println("3. Mostrar Dados do Produto");
            System.out.println("4. Informar Quantidade");
            System.out.println("5. Realizar Venda");
            System.out.println("6. Realizar Venda com Desconto");
            System.out.println("7. Mostrar Valor Final");
            System.out.println("8. Encerrar o programa");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codF = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeF = scanner.nextLine();
                    System.out.print("Preço: ");
                    double precoF = scanner.nextDouble();
                    System.out.print("Frete: ");
                    double frete = scanner.nextDouble();
                    produto = new ProdutoFisico(codF, nomeF, precoF, frete);
                    break;

                case 2:
                    System.out.print("Código: ");
                    int codD = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeD = scanner.nextLine();
                    System.out.print("Preço: ");
                    double precoD = scanner.nextDouble();
                    produto = new ProdutoDigital(codD, nomeD, precoD);
                    break;

                case 3:
                    if (produto != null) produto.exibirDados();
                    else System.out.println("Nenhum produto cadastrado!");
                    break;

                case 4:
                    System.out.print("Quantidade: ");
                    quantidade = scanner.nextInt();
                    break;

                case 5:
                    if (produto instanceof Venda && quantidade > 0) {
                        valorFinal = ((Venda) produto).realizarVenda(quantidade);
                        System.out.println("Venda realizada com sucesso!");
                    } else System.out.println("Cadastre produto e informe quantidade!");
                    break;

                case 6:
                    if (produto instanceof Venda && quantidade > 0) {
                        System.out.print("Percentual de desconto (%): ");
                        double desc = scanner.nextDouble();
                        valorFinal = ((Venda) produto).realizarVenda(quantidade, desc);
                        System.out.println("Venda com desconto realizada!");
                    } else System.out.println("Cadastre produto e informe quantidade!");
                    break;

                case 7:
                    System.out.println("Valor final da compra: R$ " + valorFinal);
                    break;

                case 8:
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
