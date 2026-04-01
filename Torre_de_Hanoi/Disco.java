/*Representa os discos que serão usados no jogo.
Os discos precisam ter um tamanho de valor inteiro.*/

public class Disco { //Criando a classe chamada Disco.
    //Atributos
    int tamanho; //Cria variavel "tamanho" do tipo inteiro, para guardar o tamanho do disco.
    String letra = "*"; //Cria variavel "letra" do tipo string, para representar a imagem do disco.
    
    //Contrutores
    public Disco (int valor) { //O construtor recebe um valor inteiro.
        tamanho = valor; //O valor recebido é utilizado para definir o tamanho do disco.
    }
    
    //Metodos
    public int getTamanho() { //Método para retornar o tamanho do disco
        return tamanho;
    }

    public String getImagem () { //Método para retorna a imagem do disco.
        return letra.repeat(tamanho) + " ".repeat(8 - tamanho);
        /*A primeira parte repete a string "*" de acordo com o tamnho do disco.
          A segunda parte repete " " (espaço) para completar o total de 8 caracteres, grantindo
          que as imagens dos discos não se sobreponham.
        */
    }
}