package Questao2;

public class InverterNome {

    private String nome;

    public void setNome (String novoValorNome) {
        nome = novoValorNome;
    }
    public String getNome () {
        return nome;
    }

    public String NomeInvertido () {
        StringBuilder inverter = new StringBuilder(nome);
        inverter.reverse();
        String nomeInvertido = inverter.toString().toUpperCase();
        return nomeInvertido; 
    }
}