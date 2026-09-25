package atividadediversao5;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = null;

        while (true) {
            System.out.println("\n--- SISTEMA DE PEDIDOS ---");
            System.out.println("1. Cadastrar Pedido Local");
            System.out.println("2. Cadastrar Pedido Delivery");
            System.out.println("3. Mostrar Dados do Pedido");
            System.out.println("4. Pagar em Dinheiro");
            System.out.println("5. Pagar via PIX");
            System.out.println("6. Pagar com Cartão");
            System.out.println("7. Encerrar o programa");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Número do Pedido: ");
                    int numL = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Cliente: ");
                    String clienteL = scanner.nextLine();
                    System.out.print("Valor do Pedido: ");
                    double valL = scanner.nextDouble();
                    pedido = new PedidoLocal(numL, clienteL, valL);
                    break;

                case 2:
                    System.out.print("Número do Pedido: ");
                    int numD = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Cliente: ");
                    String clienteD = scanner.nextLine();
                    System.out.print("Valor do Pedido: ");
                    double valD = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Endereço: ");
                    String end = scanner.nextLine();
                    System.out.print("Taxa de Entrega: ");
                    double taxa = scanner.nextDouble();
                    pedido = new PedidoDelivery(numD, clienteD, valD, end, taxa);
                    break;

                case 3:
                    if (pedido != null) pedido.exibirDados();
                    else System.out.println("Nenhum pedido cadastrado!");
                    break;

                case 4:
                    if (pedido instanceof Pagamento) {
                        ((Pagamento) pedido).processarPagamento(pedido.getValorPedido());
                    } else System.out.println("Cadastre um pedido primeiro!");
                    break;

                case 5:
                    if (pedido instanceof Pagamento) {
                        System.out.print("Chave PIX: ");
                        String pix = scanner.nextLine();
                        ((Pagamento) pedido).processarPagamento(pedido.getValorPedido(), pix);
                    } else System.out.println("Cadastre um pedido primeiro!");
                    break;

                case 6:
                    if (pedido instanceof Pagamento) {
                        System.out.print("Quantidade de parcelas: ");
                        int parc = scanner.nextInt();
                        ((Pagamento) pedido).processarPagamento(pedido.getValorPedido(), parc);
                    } else System.out.println("Cadastre um pedido primeiro!");
                    break;

                case 7:
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
