package Questao1;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparador comparador = new Comparador();

        System.out.print("Qual a primeira string que deseja? ");
        comparador.setfraseUm(scanner.nextLine());

        System.out.print("Qual a segunda string que deseja? ");
        comparador.setfraseDois(scanner.nextLine());
        System.out.println("--------------------------------");
        
        //comparando as strings

        System.out.println("String 1: " + comparador.getFraseUm());
        System.out.println("String 2: " + comparador.getFraseDois());
        System.out.println("--------------------------------");
        System.out.println("Tamanho da string '" + comparador.getFraseUm() + "' é de: " + comparador.contarNumerosUm() + " caracteres.");
        System.out.println("Tamanho da string '" + comparador.getFraseDois() + "' é de " + comparador.contarNumerosDois() + " caracteres."); 
        System.out.println("--------------------------------");
        System.out.println(comparador.compararTamanhoFrases());
        System.out.println("--------------------------------");
        System.out.println(comparador.compararConteudoFrases());
        
        scanner.close();
    }
}