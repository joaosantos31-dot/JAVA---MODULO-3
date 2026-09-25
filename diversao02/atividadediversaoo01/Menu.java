package diversao02.atividadediversaoo01;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("          CADASTRO INICIAL          ");
        System.out.println("====================================");
        System.out.print("Número da agência: ");
        String numAgencia = scanner.nextLine();
        System.out.print("Nome da agência: ");
        String nomeAgencia = scanner.nextLine();
        Agencia agencia = new Agencia(numAgencia, nomeAgencia);
        System.out.print("Número da conta: ");
        String numConta = scanner.nextLine();
        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();
        System.out.print("Saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();
        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n====================================");
            System.out.println("                MENU                ");
            System.out.println("====================================");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("7 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("------------------------------------");

            switch (opcao) {
                case 1:
                    conta.mostrarDadosCompletos();
                    break;

                case 2:
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.print("Digite o valor do pagamento PIX: R$ ");
                    double valorPix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a chave PIX: ");
                    String chavePix = scanner.nextLine();
                    conta.pagar(valorPix, chavePix);
                    break;

                case 5:
                    System.out.print("Digite o valor da compra no cartão: R$ ");
                    double valorCartao = scanner.nextDouble();
                    System.out.print("Digite a quantidade de parcelas: ");
                    int parcelas = scanner.nextInt();
                    conta.pagar(valorCartao, parcelas);
                    break;

                case 6:
                    System.out.print("Digite o valor do pagamento em dinheiro: R$ ");
                    double valorDinheiro = scanner.nextDouble();
                    conta.pagar(valorDinheiro);
                    break;

                case 7:
                    System.out.print("Digite o número da conta de destino: ");
                    String contaDestino = scanner.nextLine();
                    System.out.print("Digite o valor da transferência: R$ ");
                    double valorTransferencia = scanner.nextDouble();
                    conta.transferir(valorTransferencia, contaDestino);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Obrigado por utilizar nossos serviços!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}

