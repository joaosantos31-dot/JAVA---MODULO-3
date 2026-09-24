package atividadesiversao2;

public interface Aluguel {
    double calcularAluguel(int dias);
    double calcularAluguel(int dias, double desconto); // Sobrecarga com desconto
}
