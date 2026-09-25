package atividadediversao5;

public interface Pagamento {
    void processarPagamento(double valor); // Dinheiro
    void processarPagamento(double valor, String chavePix); // PIX (Sobrecarga)
    void processarPagamento(double valor, int parcelas); // Cartão (Sobrecarga)
}