package aula08;

public class FuncionarioFree extends Funcionarios {

    private int horasTrabalhadas;

    public FuncionarioFree(String nome, String cpf, int horasTrabalhadas) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
    }
    
}
