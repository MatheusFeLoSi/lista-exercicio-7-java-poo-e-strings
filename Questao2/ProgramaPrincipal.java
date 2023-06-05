package Questao2;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        InverterNome nome = new InverterNome();

        System.out.println("Digite o seu nome.\nFica ao seu critério letras maiúsculas ou minúsculas.");
            nome.setNome(scanner.nextLine());
    
        System.out.println("Seu nome: " + nome.getNome());
        System.out.println("Seu nome invertido é: " + nome.NomeInvertido());
    
        scanner.close();
    }
}
