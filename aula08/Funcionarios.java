package aula08;

public class Funcionarios {

    private String nome;
    private String cpf;

    public Funcionarios(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

}
