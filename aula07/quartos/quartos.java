package aula07.quartos;
import java.util.Scanner;
public class quartos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_QUARTOS = 5;
        final int MAX_RESERVAS = 25;
        int[] numeroQuartos = new int[MAX_QUARTOS];
        int[] camasDisponiveis = new int[MAX_QUARTOS];
        int totalQuartosCadastrados = 0;
        int[] reservasQuarto = new int[MAX_RESERVAS];
        String[] reservasHospede = new String[MAX_RESERVAS];
        int totalReservas = 0;
        int opcao = 0;
        do {
            System.out.println("\n=== REDE SUNSTAY - GESTÃO DE RESERVAS ===");
            System.out.println("1 - Registrar número dos quartos");
            System.out.println("2 - Registrar quantidade de camas");
            System.out.println("3 - Reservar quarto");
            System.out.println("4 - Consultar reservas por quarto");
            System.out.println("5 - Consultar reservas por hóspede");
            System.out.println("6 - Encerrar sistema");
            System.out.print("Escolha uma opção: ");
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }
            switch (opcao) {
                case 1:
                    System.out.print("Quantos quartos deseja cadastrar (máximo " + MAX_QUARTOS + "): ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();
                    if (qtd > 0 && qtd <= MAX_QUARTOS) {
                        totalQuartosCadastrados = qtd;
                        for (int i = 0; i < totalQuartosCadastrados; i++) {
                            System.out.print("Informe o número do Quarto " + (i + 1) + ": ");
                            numeroQuartos[i] = scanner.nextInt();
                        }
                        scanner.nextLine();
                        System.out.println("Quartos registrados com sucesso!");
                    } else {
                        System.out.println("Quantidade inválida! Informe um número entre 1 e " + MAX_QUARTOS + ".");
                    }
                    break;
                case 2:
                    if (totalQuartosCadastrados == 0) {
                        System.out.println("Registre os quartos na Opção 1 primeiro!");
                    } else {
                        System.out.println("--- Cadastro de Camas ---");
                        for (int i = 0; i < totalQuartosCadastrados; i++) {
                            System.out.print("Quantidade de camas disponíveis para o Quarto " + numeroQuartos[i] + ": ");
                            camasDisponiveis[i] = scanner.nextInt();
                        }
                        scanner.nextLine();
                        System.out.println("Quantidade de camas cadastrada com sucesso!");
                    }
                    break;
                case 3:
                    if (totalReservas >= MAX_RESERVAS) {
                        System.out.println("Limite total de " + MAX_RESERVAS + " reservas atingido!");
                        break;
                    }
                    System.out.print("Informe o número do quarto para reserva: ");
                    int numQuartoReserva = scanner.nextInt();
                    scanner.nextLine();
                    int indiceQuarto = -1;
                    for (int i = 0; i < totalQuartosCadastrados; i++) {
                        if (numeroQuartos[i] == numQuartoReserva) {
                            indiceQuarto = i;
                            break;
                        }
                    }
                    if (indiceQuarto == -1) {
                        System.out.println("Este quarto não existe!");
                    } else if (camasDisponiveis[indiceQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!");
                    } else {
                        System.out.print("Digite o nome do hóspede: ");
                        String nomeHospede = scanner.nextLine();
                        reservasQuarto[totalReservas] = numQuartoReserva;
                        reservasHospede[totalReservas] = nomeHospede;
                        totalReservas++;
                        camasDisponiveis[indiceQuarto]--;
                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;
                case 4:
                    System.out.print("Informe o número do quarto para consulta: ");
                    int quartoConsulta = scanner.nextInt();
                    scanner.nextLine();
                    boolean quartoExiste = false;
                    for (int i = 0; i < totalQuartosCadastrados; i++) {
                        if (numeroQuartos[i] == quartoConsulta) {
                            quartoExiste = true;
                            break;
                        }
                    }
                    if (!quartoExiste) {
                        System.out.println("Este quarto não existe!");
                    } else {
                        boolean encontrouReserva = false;
                        System.out.println("\n--- Reservas do Quarto " + quartoConsulta + " ---");
                        for (int i = 0; i < totalReservas; i++) {
                            if (reservasQuarto[i] == quartoConsulta) {
                                System.out.println("- Hóspede: " + reservasHospede[i]);
                                encontrouReserva = true;
                            }
                        }
                        if (!encontrouReserva) {
                            System.out.println("Não há reservas para este quarto!");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Informe o nome do hóspede: ");
                    String nomeConsulta = scanner.nextLine();
                    boolean encontrouHospede = false;
                    System.out.println("\n--- Reservas em nome de: " + nomeConsulta + " ---");
                    for (int i = 0; i < totalReservas; i++) {
                        if (reservasHospede[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("- Quarto: " + reservasQuarto[i]);
                            encontrouHospede = true;
                        }
                    }
                    if (!encontrouHospede) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    break;
                case 6:
                    System.out.println("Encerrando o sistema SunStay. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
        scanner.close();
    }
}