package atividadediversao1;
public class FuncionarioFreelancer extends Funcionario implements Pagamento {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioFreelancer(String nome, String cpf, int horasTrabalhadas, double valorPorHora) {
        super(nome, cpf, horasTrabalhadas * valorPorHora);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }

    public double getValorPorHora() { return valorPorHora; }
    public void setValorPorHora(double valorPorHora) { this.valorPorHora = valorPorHora; }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public double calcularPagamento(double bonus) {
        return calcularPagamento() + bonus;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor/Hora: R$ " + valorPorHora);
    }
}