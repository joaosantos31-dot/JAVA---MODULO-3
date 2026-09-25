package diversao02.atividadediversaoo01;

public class ContaCorrente extends Conta implements Pagamento {

    public ContaCorrente(String numeroConta, String titular, double saldoInicial, Agencia agencia) {
        super(numeroConta, titular, saldoInicial, agencia);
    }

    private boolean validarPagamento(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
            return false;
        }
        if (valor > this.saldo) {
            System.out.println("Erro: Saldo insuficiente para realizar a operação.");
            System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
            return false;
        }
        return true;
    }

    @Override
    public void pagar(double valor) {
        if (validarPagamento(valor)) {
            this.saldo -= valor;
            System.out.println("Pagamento em dinheiro realizado com sucesso!");
            System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
        }
    }

    public void pagar(double valor, String chavePix) {
        if (validarPagamento(valor)) {
            this.saldo -= valor;
            System.out.println("Pagamento via PIX realizado com sucesso!");
            System.out.println("Chave PIX utilizada: " + chavePix);
            System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
        }
    }

    public void pagar(double valor, int parcelas) {
        if (parcelas <= 0) {
            System.out.println("Erro: A quantidade de parcelas deve ser maior que zero.");
            return;
        }

        if (validarPagamento(valor)) {
            double valorParcela = valor / parcelas;
            this.saldo -= valor;
            System.out.println("Pagamento com Cartão realizado com sucesso!");
            System.out.printf("Compra parcelada em %dx de R$ %.2f\n", parcelas, valorParcela);
            System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
        }
    }

    public void transferir(double valor, String contaDestino) {
        if (validarPagamento(valor)) {
            this.saldo -= valor;
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Conta Destino: " + contaDestino);
            System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
        }
    }
}
