import java.util.Scanner;

public class Mover {
    //Atributos
    int torred;
    int torrep;
    Scanner entrada = new Scanner(System.in);
    Pilha<Pilha<Disco>> torre;

    //Contrutores
    public Mover(Pilha<Pilha<Disco>> p) {
        torred = 0;
        torrep = 0;
        torre = p;
    }
        
    //Métodos
    public void torre_origem() throws Exception{
        while (true) {
            //Recebe a entrada da torre de origem
            System.out.print("De qual torre você vai mover (1, 2 ou 3): ");
            torred = entrada.nextInt();
            //Valida se a torre de origem é valida
            if (torred > 3 || torred < 1) {
                System.out.printf("Torre invalida, escolha novemente\n");
            } else if (torre.percorrer(torred - 1).isEmpty() == true) {
                System.out.printf("Torre sem discos, escolha novemente\n");
            } else {
                break;
            } 
        }
    }
        
    public void torre_destino() throws Exception{
        while (true) {
            //Recebe a entrada da torre de destino
            System.out.print("Para qual torre você quer mover (1, 2, ou 3): ");
            torrep = entrada.nextInt();
            //Valida se a torre de destino é valida
            if (torrep > 3 || torrep < 1) {
                System.out.printf("Torre invalida, escolha novemente.\n");
            } else if (torre.percorrer(torrep - 1).isEmpty() == true) {
                //escrever movimento
                torre.percorrer(torrep - 1).push(torre.percorrer(torred - 1).pop());
                System.out.print("Movimento realizado com sucesso.\n");
                break;
            } else if (torre.percorrer(torred - 1).topo().getTamanho() > torre.percorrer(torrep - 1).topo().getTamanho()) {
                System.out.printf("Disco da torre de origem é maior do que o disco na torre de destino. Escolha novamente.\n");
            } else {
                torre.percorrer(torrep - 1).push(torre.percorrer(torred - 1).pop());
                System.out.print("Movimento realizado com sucesso.\n");
                break;
            }
        }
    }

    public boolean solucao(int quantidade) throws Exception {
        if (torre.percorrer(2).isFull()) {
            System.out.printf("Parabéns, você resolveu o problema em %d movimentos!\n", quantidade);
        }
        return torre.percorrer(2).isFull();
    }    
}
