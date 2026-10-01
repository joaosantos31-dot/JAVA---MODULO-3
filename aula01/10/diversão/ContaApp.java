import java.util.Scanner;

public class ContaApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CadastroConta cadastro = new CadastroConta();

    public static void main(String[] args) {
        int opcao = 0;

        do {
            exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                System.out.println();

                switch (opcao) {
                    case 1:
                        cadastrarConta();
                        break;
                    case 2:
                        buscarConta();
                        break;
                    case 3:
                        removerConta();
                        break;
                    case 4:
                        System.out.println("Encerrando o programa... Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número entre 1 e 4.\n");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\n");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE CONTAS BANCÁRIAS ===");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Buscar Conta");
        System.out.println("3. Remover Conta");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarConta() throws Exception {
        System.out.println("--- CADASTRO DE CONTA ---");
        System.out.print("Número da conta: ");
        String numero = scanner.nextLine();

        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Saldo inicial: R$ ");
        double saldo;
        try {
            saldo = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new ExcecaoDadoInvalido("Erro: O saldo inicial deve ser um valor numérico válido.");
        }

        Conta novaConta = new Conta(numero, titular, saldo);
        cadastro.inserir(novaConta);
        System.out.println("✓ Conta cadastrada com sucesso!\n");
    }

    private static void buscarConta() throws Exception {
        System.out.println("--- BUSCA DE CONTA ---");
        System.out.print("Informe o número da conta: ");
        String numero = scanner.nextLine();

        Conta conta = cadastro.buscar(numero);
        System.out.println("✓ Conta encontrada:");
        System.out.println(conta + "\n");
    }

    private static void removerConta() throws Exception {
        System.out.println("--- REMOÇÃO DE CONTA ---");
        System.out.print("Informe o número da conta a ser removida: ");
        String numero = scanner.nextLine();

        cadastro.remover(numero);
        System.out.println("✓ Operação realizada com sucesso! A conta foi removida.\n");
    }
}