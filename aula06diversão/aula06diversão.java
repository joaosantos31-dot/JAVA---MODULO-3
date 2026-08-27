package aula06diversão;
import java.util.Scanner;
public class aula06diversão {
    private static final int CAPACIDADE_MAXIMA = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[CAPACIDADE_MAXIMA];
        int[] quantidades = new int[CAPACIDADE_MAXIMA];
        int qtd = 0;
        int opcao = 0;
        do {
            System.out.println("\n--- SISTEMA DE CONTROLE DE ESTOQUE ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    if (qtd >= CAPACIDADE_MAXIMA) {
                        System.out.println("Erro: Limite máximo de " + CAPACIDADE_MAXIMA + " produtos atingido!");
                    } else {
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite a quantidade em estoque: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();
                        nomes[qtd] = nome;
                        quantidades[qtd] = quantidade;
                        qtd++;
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n--- LISTA DE PRODUTOS ---");
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Índice [" + i + "] | Nome: " + nomes[i] + " | Quantidade: " + quantidades[i]);
                        }
                    }
                    break;
                case 3:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para pesquisar.");
                    } else {
                        System.out.print("Digite o nome do produto a pesquisar: ");
                        String nomeBusca = scanner.nextLine();
                        int indiceEncontrado = -1;
                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                                indiceEncontrado = i;
                                break;
                            }
                        }
                        if (indiceEncontrado != -1) {
                            System.out.println("Produto encontrado!");
                            System.out.println("Índice [" + indiceEncontrado + "] | Nome: " + nomes[indiceEncontrado] + " | Quantidade: " + quantidades[indiceEncontrado]);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;
                case 4:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para alterar.");
                    } else {
                        System.out.print("Digite o nome do produto a alterar: ");
                        String nomeAlterar = scanner.nextLine();
                        int indiceAlterar = -1;
                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                                indiceAlterar = i;
                                break;
                            }
                        }
                        if (indiceAlterar != -1) {
                            System.out.print("Digite o novo nome do produto: ");
                            nomes[indiceAlterar] = scanner.nextLine();
                            System.out.print("Digite a nova quantidade: ");
                            quantidades[indiceAlterar] = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Produto alterado com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;
                case 5:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para remover.");
                    } else {
                        System.out.print("Digite o nome do produto a remover: ");
                        String nomeRemover = scanner.nextLine();
                        int indiceRemover = -1;
                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                                indiceRemover = i;
                                break;
                            }
                        }
                        if (indiceRemover != -1) {
                            for (int i = indiceRemover; i < qtd - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                quantidades[i] = quantidades[i + 1];
                            }
                            nomes[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;
                            qtd--;

                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 6);
        scanner.close();
    }
}