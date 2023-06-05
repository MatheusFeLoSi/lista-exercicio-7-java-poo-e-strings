package Questao1;

public class Comparador {
    private String fraseUm;
    private String fraseDois;
    public void setfraseUm(String novoValorFraseUm) {
       fraseUm = novoValorFraseUm;
    }
    public String getFraseUm() {
        return fraseUm;
    }

    public void setfraseDois(String novoValorFraseDois) {
        fraseDois = novoValorFraseDois;
    }
    public String getFraseDois() {
        return fraseDois;
    }

    public int contarNumerosUm () {
       return fraseUm.length();    
    }
    public int contarNumerosDois () {
       return fraseDois.length();    
    }

    public String compararTamanhoFrases () {
        if (fraseUm.length() != fraseDois.length()) {
            return "As duas strings são de tamanhos diferentes.";
        }
        else {
            return "As duas strings são de tamanhos iguais.";
        }  
    }
    public String compararConteudoFrases () {
        if (fraseUm.equals(fraseDois)) {
            return "As duas strings possuem conteúdos iguais.";
        }
        else {
            return "As duas strings possuem conteúdos diferentes.";
        }
    }
}