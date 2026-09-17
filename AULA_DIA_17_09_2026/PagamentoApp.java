package AULA_DIA_17_09_2026;

import java.util.Scanner;

public class PagamentoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do pagamento:\n");
        double valor = sc.nextDouble();
        Pix pix = new Pix();
        pix.pagar(valor);
        sc.close();
    }
}
