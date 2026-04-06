/*
Integrantes do Grupo:
Guilherme Longo RA: 10736785
Gustavo Francisco Toito RA: 10438660
Helen Santana de Araujo Teixeira RA: 10742524
 */

/*Representa a torre usada no jogo.
É uma pilha.*/

public class Pilha <T> {
    // atributos
    private static final int TAM_DEFAULT = 100;
    private int topoPilha;
    private T elementos[];

    // construtores
    @SuppressWarnings("unchecked")
    public Pilha(int tamanho) {
        this.elementos = (T[]) new Object[tamanho];
        this.topoPilha = -1;
    }

    public Pilha() {
        this(TAM_DEFAULT);
    }
    // métodos
    public boolean isEmpty() { // Retorna true se a pilha estiver vazia.
        return this.topoPilha == -1;
    }

    public boolean isFull() { // retorna true se a pilha estiver cheia.
        return topoPilha == elementos.length - 1;
    }

    public void push(T e) throws Exception { //Coloca um elemento no topo da pilha.
        if (!this.isFull()) {
            topoPilha++;
            this.elementos[topoPilha] = e;
        }
        else {
            throw new Exception("Overflow - Estouro de pilha.");
        }
    }

    public T pop() throws Exception { //Retira o elemento no topa da pilha e retorna ele.
        if (!this.isEmpty()) {
            T temp = this.elementos[topoPilha];
            topoPilha--;
            return temp;
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha.");
        }
    }

    public T topo() throws Exception { //Exibe o elemento no topo da pilha.
        if (!this.isEmpty()) {
            return this.elementos[topoPilha];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha.");
        }
    }

    public int quantidade() { //Método para retornar a quantidade de elementos na pilha.
        return topoPilha + 1;
    }

    public int tamanho() { //Método para retornar o tamanho da pilha.
        return elementos.length;
    }

    public T percorrer(int i) throws Exception { 
        return elementos[tamanho()-1-i];
        /*Método para mostrar o elemento na pilha sem causar nenhuma alteração.
          Feito para ser usado em loops.
        */
    }


    
}