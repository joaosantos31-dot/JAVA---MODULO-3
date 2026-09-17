package AULA_DIA_17_09_2026;
public class Pix implements Pagamento {
    
    @Override 
    public void pagar(double valor){
        System.out.println("Pagamento via Pix no valor de: " + valor);
    }
}
