package atividadediversao3;

public class ProdutoDigital extends Produto implements Venda {

    public ProdutoDigital(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double realizarVenda(int quantidade) {
        return getPreco() * quantidade;
    }

    @Override
    public double realizarVenda(int quantidade, double percentualDesconto) {
        double subtotal = getPreco() * quantidade;
        return subtotal - (subtotal * (percentualDesconto / 100));
    }
}
