import java.util.Scanner;

public class teste_Op_1 {

        //Scanner de entrada do usuario
        private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        Pilha<Disco> t1 = new Pilha<Disco>(5);
        Pilha<Disco> t2 = new Pilha<Disco>(5);
        Pilha<Disco> t3 = new Pilha<Disco>(5);

        Disco d1 = new Disco(1);
        Disco d2 = new Disco(2);
        Disco d3 = new Disco(3);
        Disco d4 = new Disco(4);
        Disco d5 = new Disco(5);
    
        t1.push(d5);
        t1.push(d4);
        t1.push(d3);
        t1.push(d2);
        t1.push(d1);
        
        movimento();
    }

    public static void movimento(){
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

        //Falta verificar entrada valida, executar a movimentação e detectar se o problema foi resolvido
        /*
        //Testes
        System.out.printf("Teste %d e %d", torred, torrep);
        */
    }
}