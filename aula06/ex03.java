package aula06;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for(int i=0;i<nomes.length;i++){
        System.out.println("Cadastre o nome: ");
        nomes[i] = sc.nextLine();
        }
        System.out.println("Nomes cadastrados: ");
        for(String n:nomes){
            System.out.println(n);
        }
        System.out.println("Nomes em registro: ");
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
        sc.close();
    }
}
