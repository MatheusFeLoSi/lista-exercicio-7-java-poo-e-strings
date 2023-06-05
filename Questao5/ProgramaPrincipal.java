package Questao5;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ValidarNumero validar = new ValidarNumero();


        System.out.print("Digite um número de telefone: ");
        validar.setNumero(scanner.nextLine());
        System.out.println("--------------------------------");
        
        System.out.println("Número do telefone: " + validar.getNumero());
        System.out.println("O número possui: " + validar.TamanhoNumero() + " dígitos");
        System.out.println("Telefone corrigido sem formatação: " + validar.FormatarComNove());
        System.out.println("Telefone corrigido com formatação: " + validar.FormatarComTraco());
    
        scanner.close();
    }
}
