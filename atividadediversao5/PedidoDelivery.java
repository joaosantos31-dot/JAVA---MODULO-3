package atividadediversao5;

public class PedidoDelivery extends Pedido implements Pagamento {
    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numeroPedido, String nomeCliente, double valorPedido, String endereco, double taxaEntrega) {
        super(numeroPedido, nomeCliente, valorPedido);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getTaxaEntrega() { return taxaEntrega; }
    public void setTaxaEntrega(double taxaEntrega) { this.taxaEntrega = taxaEntrega; }

    public double getValorTotalDelivery() {
        return getValorPedido() + taxaEntrega;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento em Dinheiro (com taxa): R$ " + getValorTotalDelivery());
    }

    @Override
    public void processarPagamento(double valor, String chavePix) {
        System.out.println("Pagamento via PIX para " + chavePix + " | Total com taxa: R$ " + getValorTotalDelivery());
    }

    @Override
    public void processarPagamento(double valor, int parcelas) {
        double total = getValorTotalDelivery();
        System.out.println("Pagamento no Cartão: R$ " + total + " em " + parcelas + "x de R$ " + (total / parcelas));
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Endereço de Entrega: " + endereco);
        System.out.println("Taxa de Entrega: R$ " + taxaEntrega);
        System.out.println("Valor Total com Taxa: R$ " + getValorTotalDelivery());
    }
}
