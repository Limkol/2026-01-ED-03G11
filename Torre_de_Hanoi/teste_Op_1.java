import java.util.Scanner;

public class teste_Op_1 {

        //Scanner de entrada do usuario
        public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.print("Escolha o numero de discos:");
        int num_Discos = entrada.nextInt();

        Pilha<Pilha> p = new Pilha<Pilha>(3);

        Pilha<Disco> t1 = new Pilha<Disco>(num_Discos);
        Pilha<Disco> t2 = new Pilha<Disco>(num_Discos);
        Pilha<Disco> t3 = new Pilha<Disco>(num_Discos);

        p.push(t1);
        p.push(t2);
        p.push(t3);

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
            if ( torred < 4 && torred > 0) {
                break;
            }
            System.out.printf("Torre invalida, escolha novemente\n");
        }
        
        while (true) {
            //Recebe a entrada da torre de destino
            System.out.print("Para qual torre você quer mover (1, 2, ou 3): ");
            torrep = entrada.nextInt();
            //Valida se a torre de destino é valida
            if (torrep < 4 && torrep > 0) {
                break;
            }
            System.out.printf("Torre invalida, escolha novemente\n");
        }

        if (p.percorrer(torred - 1).topo().getTamanho())

        if (t3.isFull()) {
            System.out.printf("Parabéns, você resolveu o problema!\n");
        }

        //Falta executar a movimentação e veficar se ela é valida
        /*
        //Testes
        System.out.printf("Teste %d e %d", torred, torrep);
        */
    }
}