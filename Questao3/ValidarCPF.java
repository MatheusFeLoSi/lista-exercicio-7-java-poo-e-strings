package Questao3;

public class ValidarCPF {
    private String cpf;
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String getCPF() {
        return cpf;
    }

    public void validadorDeCpf() {
        if (cpf.length() == 14) {
            if (cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
                System.out.println("CPF válido");
            }
            else {
                System.out.println("CPF inválido.");
            }
        }
    }
}