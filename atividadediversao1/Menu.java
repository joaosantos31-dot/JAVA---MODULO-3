package atividadediversao1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = null;

        while (true) {
            System.out.println("\n--- MENU FUNCIONÁRIOS ---");
            System.out.println("1. Cadastrar Funcionário CLT");
            System.out.println("2. Cadastrar Funcionário Freelancer");
            System.out.println("3. Mostrar Dados Cadastrados");
            System.out.println("4. Calcular Pagamento");
            System.out.println("5. Calcular Pagamento com Bônus");
            System.out.println("6. Consultar Dados do Funcionário");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeClt = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfClt = scanner.nextLine();
                    System.out.print("Salário Mensal: ");
                    double salarioClt = scanner.nextDouble();
                    funcionario = new FuncionarioCLT(nomeClt, cpfClt, salarioClt);
                    System.out.println("Funcionário CLT cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeFree = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfFree = scanner.nextLine();
                    System.out.print("Horas Trabalhadas: ");
                    int horas = scanner.nextInt();
                    System.out.print("Valor por Hora: ");
                    double valorHora = scanner.nextDouble();
                    funcionario = new FuncionarioFreelancer(nomeFree, cpfFree, horas, valorHora);
                    System.out.println("Funcionário Freelancer cadastrado com sucesso!");
                    break;

                case 3:
                case 6:
                    if (funcionario != null) {
                        funcionario.exibirDados();
                    } else {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    break;

                case 4:
                    if (funcionario instanceof Pagamento) {
                        System.out.println("Pagamento total: R$ " + ((Pagamento) funcionario).calcularPagamento());
                    } else {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    break;

                case 5:
                    if (funcionario instanceof Pagamento) {
                        System.out.print("Informe o valor do bônus: ");
                        double bonus = scanner.nextDouble();
                        System.out.println("Pagamento com Bônus: R$ " + ((Pagamento) funcionario).calcularPagamento(bonus));
                    } else {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    break;

                case 7:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
