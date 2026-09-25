package atividadediversao5;

public class PedidoLocal extends Pedido implements Pagamento {

    public PedidoLocal(int numeroPedido, String nomeCliente, double valorPedido) {
        super(numeroPedido, nomeCliente, valorPedido);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento em Dinheiro efetuado no valor de: R$ " + valor);
    }

    @Override
    public void processarPagamento(double valor, String chavePix) {
        System.out.println("Pagamento em PIX realizado para a chave: " + chavePix + " | Valor: R$ " + valor);
    }

    @Override
    public void processarPagamento(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.println("Pagamento no Cartão parcelado em " + parcelas + "x de R$ " + valorParcela);
    }
}
