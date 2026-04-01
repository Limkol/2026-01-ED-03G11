/* Classe para mostrar as torres e as posições dos discos */

public class Mostrar {

    //Atributos
    int num_Discos; //Cria variavel para quantidade de discos usados no jogo.
    Pilha<Pilha<Disco>> torre; //Variavel para pilha de controle.
    
    //Contrutores 
    public Mostrar(int n, Pilha<Pilha<Disco>> p)  { //Recebe a quantidade de discos e a pilha controle.
        
        //Salva o que foi recebido nos atributos da classe.
        num_Discos = n;
        torre = p;
    }
    
    //Métodos
    public void mostrar_torres() throws Exception { 
        for (int i = 0; i < num_Discos; i++) { //Loop correspondente a quantidade de linhas da imagem.
            for(int j = 0; j < 3; j++) { //Loop correspondente as colunas/torres da imagem.
                if (torre.percorrer(j).tamanho() - i <= torre.percorrer(j).quantidade()) { //Se posição atual for menor ou igual a quantidade de elementos na pilha. Então tem um disco nessa posição.
                    System.out.printf("%s", torre.percorrer(j).percorrer(i).getImagem()); //Exibe imagem do disco.
                } else { //Se não tiver disco na posição, exibe espaço para passar a proxima coluna.
                    System.out.printf("        "); 
                }
            }
            System.out.printf("\n"); //Para passar para a linha de baixo.
        }
        System.out.printf("TORRE_1 TORRE_2 TORRE_3\n"); //Exibe o nome das torres na base.
    }    
}