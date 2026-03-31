import java.util.Scanner;

public class teste_Op_1 {

    //Scanner de entrada do usuario
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.print("Escolha o numero de discos:");
        int num_Discos = entrada.nextInt();

        Pilha<Pilha<Disco>> p = new Pilha<Pilha<Disco>>(3);

        Pilha<Disco> t1 = new Pilha<Disco>(num_Discos);
        Pilha<Disco> t2 = new Pilha<Disco>(num_Discos);
        Pilha<Disco> t3 = new Pilha<Disco>(num_Discos);

        p.push(t3);
        p.push(t2);
        p.push(t1);

        for (int i = num_Discos; i > 0; i--) {
            Disco d = new Disco(i);
            t1.push(d);
        }

        int torred = 0;
        int torrep = 0;

        while (true) {
            //Recebe a entrada da torre de origem
            System.out.print("De qual torre você vai mover (1, 2 ou 3): ");
            torred = entrada.nextInt();
            //Valida se a torre de origem é valida
            if (torred > 3 || torred < 1) {
                System.out.printf("Torre invalida, escolha novemente\n");
            } else if (p.percorrer(torred - 1).isEmpty() == true) {
                System.out.printf("Torre sem discos, escolha novemente\n");
            } else {
                break;
            } 
        }
        
        while (true) {
            //Recebe a entrada da torre de destino
            System.out.print("Para qual torre você quer mover (1, 2, ou 3): ");
            torrep = entrada.nextInt();
            //Valida se a torre de destino é valida
            if (torrep > 3 || torrep < 1) {
                System.out.printf("Torre invalida, escolha novemente.\n");
            } else if (p.percorrer(torrep - 1).isEmpty() == true) {
                //escrever movimento
                p.percorrer(torrep - 1).push(p.percorrer(torred - 1).pop());
                System.out.print("Movimento realizado com sucesso.\n");
                break;
            } else if (p.percorrer(torred - 1).topo().getTamanho() > p.percorrer(torrep - 1).topo().getTamanho()) {
                System.out.printf("Disco da torre de origem é maior do que o disco na torre de destino. Escolha novamente.\n");
            } else {
                p.percorrer(torrep - 1).push(p.percorrer(torred - 1).pop());
                System.out.print("Movimento realizado com sucesso.\n");
                break;
            }
        }
        
        if (t3.isFull()) {
            System.out.printf("Parabéns, você resolveu o problema!\n");
        }
    }
}