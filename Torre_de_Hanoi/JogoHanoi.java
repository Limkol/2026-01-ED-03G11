/*Representa o main.
Responsável pelo controle do jogo.*/

public class JogoHanoi {
    public static void main(String[] args) {
        
        Pilha<Disco> t1 = new Pilha<Disco>(5);
        Pilha<Disco> t2 = new Pilha<Disco>(5);
        Pilha<Disco> t3 = new Pilha<Disco>(5);

        Disco d1 = new Disco(1);
        Disco d2 = new Disco(2);
        Disco d3 = new Disco(3);
        Disco d4 = new Disco(4);
        Disco d5 = new Disco(5);
        
        t1.push(d1);

        System.out.printf("Teste:%s", d5.getImagem());
    }
}