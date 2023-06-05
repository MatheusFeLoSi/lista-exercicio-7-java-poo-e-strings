package Questao5;

public class ValidarNumero {
    
    private String numero;

    public void setNumero(String novoNumero) {
        numero = novoNumero;
    }
    
    public String getNumero() {
        return numero;
    }

    public int TamanhoNumero() {
        return numero.length();
    }

    public String FormatarComNove() {
        if (numero.length() < 8 || numero.length() > 9) {
            return "Número inválido";
        }
        else if (numero.length() == 8) {
            numero = "9" + numero;
            return numero;
        } 
        else if (numero.length() == 9 && numero.charAt(0) == '9') {
            return "Número com o nove já incluído.";
        } 
        else {
            return "Número inválido.";
        }
    }
    
    public String FormatarComTraco() {
        if (numero.length() == 9 || numero.length() == 10) {
            String numeroFormatado = numero.substring(0, 5) + "-" + numero.substring(5);
            return numeroFormatado;
        } else {
            return "Número inválido.";
        }
    }
}
