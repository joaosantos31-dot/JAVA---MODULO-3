package AULA_DIA_17_09_2026;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
    }
}
