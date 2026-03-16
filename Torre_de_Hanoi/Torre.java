/*Representa a torre usada no jogo.
É uma pilha.*/

public class Torre {
    // atributos
    private static final int TAM_DEFAULT = 100;
    private int topoTorre;
    private int elementos[];
    // construtores
    public Torre(int tamanho) {
        this.elementos = new int[tamanho];
        this.topoTorre = -1;
    }

    public Torre() {
        this(TAM_DEFAULT);
    }
    // métodos
    public boolean isEmpty() {
        return this.topoTorre == -1;
    }

    public boolean isFull() {
        return topoTorre == elementos.length - 1;
    }

    public void push(int e) throws Exception {
        if (!this.isFull()) {
            topoTorre++;
            this.elementos[topoTorre] = e;
        }
        else {
            throw new Exception("Overflow - Estouro de pilha.");
        }
    }

    public int pop() throws Exception {
        if (!this.isEmpty()) {
            int temp = this.elementos[topoTorre];
            topoTorre--;
            return temp;
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha.");
        }
    }

    public int topo() throws Exception {
        if (!this.isEmpty()) {
            return this.elementos[topoTorre];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha.");
        }
    }
    
    public int sizeElements() {
        return topoTorre + 1;
    }




    
}