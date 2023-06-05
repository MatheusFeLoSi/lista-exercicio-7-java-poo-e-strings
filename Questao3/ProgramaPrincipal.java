package Questao3;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        ValidarCPF validarCPF = new ValidarCPF();

        System.out.print("Digite seu CPF de acordo com o esquema a seguir: (xxx.xxx.xxx-xx) ");
            validarCPF.setCPF(scanner.next());
        
        validarCPF.validadorDeCpf();

        scanner.close();
    }
}
