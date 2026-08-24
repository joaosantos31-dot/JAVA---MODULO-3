package aula05diversão;

public class aula05diversão03 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            if (i <= 51) {
                if (i % 2 != 0) {
                    System.out.println("O número ímpar é: " + i);
                }
            }
            else {
                if (i % 2 == 0) {
                    System.out.println("O número par é: " + i);
                }
            }
        }
    }
}