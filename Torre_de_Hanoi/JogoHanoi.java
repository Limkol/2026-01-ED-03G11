/*Representa o main.
Responsável pelo controle do jogo.*/

public class JogoHanoi {
    public static void main(String[] args) {

        Disco d1 = new Disco(1);
        Disco d2 = new Disco(2);
        Disco d3 = new Disco(3);
        Disco d4 = new Disco(4);
        Disco d5 = new Disco(5);
        
        System.out.printf("Teste:%s", d5.getImagem());
    }
}