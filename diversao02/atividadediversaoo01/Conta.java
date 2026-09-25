package diversao02.atividadediversaoo01;

public class Conta {
    private String numeroConta;
    private String titular;
    protected double saldo;
    private Agencia agencia;

    public Conta(String numeroConta, String titular, double saldoInicial, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
            System.out.printf("Novo Saldo: R$ %.2f\n", this.saldo);
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo Atual: R$ %.2f\n", this.saldo);
    }

    public void mostrarDadosCompletos() {
        System.out.println("--- DADOS DA CONTA ---");
        System.out.println("Agência: " + agencia.getNumero() + " - " + agencia.getNome());
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
