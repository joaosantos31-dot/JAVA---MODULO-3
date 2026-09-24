package atividadesiversao2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo = null;
        int diasInformados = 0;

        while (true) {
            System.out.println("\n--- LOCAÇÃO DE VEÍCULOS ---");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Mostrar Dados do Veículo");
            System.out.println("4. Informar Quantidade de Dias");
            System.out.println("5. Calcular Valor do Aluguel");
            System.out.println("6. Calcular Aluguel com Desconto");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                case 2:
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Valor da Diária: ");
                    double diaria = scanner.nextDouble();

                    if (opcao == 1) {
                        veiculo = new Carro(placa, modelo, ano, diaria);
                    } else {
                        veiculo = new Moto(placa, modelo, ano, diaria);
                    }
                    System.out.println("Veículo cadastrado!");
                    break;

                case 3:
                    if (veiculo != null) {
                        veiculo.exibirDados();
                    } else {
                        System.out.println("Nenhum veículo cadastrado!");
                    }
                    break;

                case 4:
                    System.out.print("Digite a quantidade de dias: ");
                    diasInformados = scanner.nextInt();
                    break;

                case 5:
                    if (veiculo instanceof Aluguel && diasInformados > 0) {
                        double total = ((Aluguel) veiculo).calcularAluguel(diasInformados);
                        System.out.println("Valor total do aluguel: R$ " + total);
                    } else {
                        System.out.println("Cadastre o veículo e informe a quantidade de dias primeiro!");
                    }
                    break;

                case 6:
                    if (veiculo instanceof Aluguel && diasInformados > 0) {
                        System.out.print("Valor do desconto: R$ ");
                        double desconto = scanner.nextDouble();
                        double total = ((Aluguel) veiculo).calcularAluguel(diasInformados, desconto);
                        System.out.println("Valor final com desconto: R$ " + total);
                    } else {
                        System.out.println("Cadastre o veículo e informe a quantidade de dias primeiro!");
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
