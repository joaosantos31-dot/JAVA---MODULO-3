package atividadediversao4;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso = null;
        String nomeAluno = "";
        double valorMatricula = 0;

        while (true) {
            System.out.println("\n--- SISTEMA DE CURSOS ---");
            System.out.println("1. Cadastrar Curso Presencial");
            System.out.println("2. Cadastrar Curso Online");
            System.out.println("3. Cadastrar Nome do Aluno");
            System.out.println("4. Realizar Matrícula");
            System.out.println("5. Realizar Matrícula com Desconto");
            System.out.println("6. Mostrar Dados do Curso");
            System.out.println("7. Mostrar Dados da Matrícula");
            System.out.println("8. Encerrar o programa");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codP = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeP = scanner.nextLine();
                    System.out.print("Carga Horária: ");
                    int chP = scanner.nextInt();
                    System.out.print("Valor: ");
                    double valP = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Sala: ");
                    String sala = scanner.nextLine();
                    System.out.print("Turno: ");
                    String turno = scanner.nextLine();
                    curso = new CursoPresencial(codP, nomeP, chP, valP, sala, turno);
                    break;

                case 2:
                    System.out.print("Código: ");
                    int codO = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeO = scanner.nextLine();
                    System.out.print("Carga Horária: ");
                    int chO = scanner.nextInt();
                    System.out.print("Valor: ");
                    double valO = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Endereço Plataforma: ");
                    String url = scanner.nextLine();
                    System.out.print("Código de Acesso: ");
                    String codAcesso = scanner.nextLine();
                    curso = new CursoOnline(codO, nomeO, chO, valO, url, codAcesso);
                    break;

                case 3:
                    System.out.print("Nome do Aluno: ");
                    nomeAluno = scanner.nextLine();
                    break;

                case 4:
                    if (curso instanceof Matricula) {
                        valorMatricula = ((Matricula) curso).realizarMatricula();
                        System.out.println("Matrícula efetuada!");
                    } else System.out.println("Cadastre o curso primeiro!");
                    break;

                case 5:
                    if (curso instanceof Matricula) {
                        System.out.print("Valor do desconto: R$ ");
                        double desc = scanner.nextDouble();
                        valorMatricula = ((Matricula) curso).realizarMatricula(desc);
                        System.out.println("Matrícula com desconto efetuada!");
                    } else System.out.println("Cadastre o curso primeiro!");
                    break;

                case 6:
                    if (curso != null) curso.exibirDados();
                    else System.out.println("Nenhum curso cadastrado!");
                    break;

                case 7:
                    System.out.println("Aluno: " + (nomeAluno.isEmpty() ? "Não informado" : nomeAluno));
                    System.out.println("Curso: " + (curso != null ? curso.getNome() : "Nenhum"));
                    System.out.println("Valor a pagar: R$ " + valorMatricula);
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
