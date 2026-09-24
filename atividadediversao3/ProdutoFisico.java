package atividadediversao3;

public class ProdutoFisico extends Produto implements Venda {
    private double frete;

    public ProdutoFisico(int codigo, String nome, double preco, double frete) {
        super(codigo, nome, preco);
        this.frete = frete;
    }

    public double getFrete() { return frete; }
    public void setFrete(double frete) { this.frete = frete; }

    @Override
    public double realizarVenda(int quantidade) {
        return (getPreco() * quantidade) + frete;
    }

    @Override
    public double realizarVenda(int quantidade, double percentualDesconto) {
        double subtotal = getPreco() * quantidade;
        double valorComDesconto = subtotal - (subtotal * (percentualDesconto / 100));
        return valorComDesconto + frete;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor do Frete: R$ " + frete);
    }
}