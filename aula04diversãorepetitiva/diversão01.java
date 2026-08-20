package aula04diversãorepetitiva;
import java.util.Scanner;

public class diversão01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            System.out.println("Nunca mais vou fazer bagunça - " + i);
        }
        sc.close();
    }
}