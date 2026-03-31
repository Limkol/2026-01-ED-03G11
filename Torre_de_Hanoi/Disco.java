/*Representa os discos que serão usados no jogo.
Os discos precisam ter um tamanho de valor inteiro.*/

public class Disco {
    //Atributos
    int tamanho;
    String letra = "*";
    
    //Contrutores
    public Disco (int valor) {
        tamanho = valor;
    }
    
    //Metodos
    public int getTamanho() {
        return tamanho;
    }

    public String getImagem () {
        return letra.repeat(tamanho) + " ".repeat(8 - tamanho);
    }
}