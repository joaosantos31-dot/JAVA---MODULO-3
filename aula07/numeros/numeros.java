package aula07.numeros;
import java.util.Scanner;
public class numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CAPACIDADE = 5;
        int[] numeros = new int[CAPACIDADE];
        int quantidade = 0;
        int opcao = 0;
        do {
            System.out.println("\n=== MENU INTERATIVO ===");
            System.out.println("1. Inserir número");
            System.out.println("2. Listar números");
            System.out.println("3. Remover número");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next();
                continue;
            }
            switch (opcao) {
                case 1:
                    if (quantidade < CAPACIDADE) {
                        System.out.print("Digite o número a ser inserido: ");
                        int numero = scanner.nextInt();
                        numeros[quantidade] = numero;
                        quantidade++;
                        System.out.println("Número " + numero + " inserido com sucesso!");
                    } else {
                        System.out.println("Erro: O array está cheio! Não é possível inserir novos números.");
                    }
                    break;
                case 2:
                    if (quantidade == 0) {
                        System.out.println("Não há números cadastrados.");
                    } else {
                        System.out.println("\n--- Números Armazenados ---");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Índice [" + i + "]: " + numeros[i]);
                        }
                    }
                    break;
                case 3:
                    if (quantidade == 0) {
                        System.out.println("Erro: O array está vazio! Não há o que remover.");
                    } else {
                        System.out.print("Digite o índice do número a ser removido (0 a " + (quantidade - 1) + "): ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < quantidade) {
                            int removido = numeros[indice];
                            for (int i = indice; i < quantidade - 1; i++) {
                                numeros[i] = numeros[i + 1];
                            }
                            quantidade--;
                            System.out.println("Número " + removido + " removido do índice " + indice + " com sucesso!");
                        } else {
                            System.out.println("Erro: Índice inválido!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
        scanner.close();
    }
}

