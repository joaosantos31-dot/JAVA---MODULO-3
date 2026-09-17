package calculadora;

public class CalApp {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(10, 21));
        System.out.println(calc.somar(11, 13, 24));
        System.out.println(calc.somar(10.5, 7.5));
    }
}
