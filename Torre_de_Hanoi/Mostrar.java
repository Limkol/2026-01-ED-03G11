public class Mostrar {
    //Atributos
    int num_Discos;
    Pilha<Pilha<Disco>> torre;
    
    //Contrutores 
    public Mostrar(int n, Pilha<Pilha<Disco>> p)  {
        num_Discos = n;
        torre = p;
    }
    
    //Métodos
    public void mostrar_torres() throws Exception { //Se entrada igual a 2, exibe as torres com os discos
        for (int i = 0; i < num_Discos; i++) {
            for(int j = 0; j < 3; j++) {
                if (torre.percorrer(j).tamanho() - i <= torre.percorrer(j).quantidade()) {
                    System.out.printf("%s", torre.percorrer(j).percorrer(i).getImagem());
                } else {
                    System.out.printf("        ");
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("TORRE_1 TORRE_2 TORRE_3\n");
    }    
}