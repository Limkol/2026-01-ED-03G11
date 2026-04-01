/* Classe para mover os discos entre as torres */

import java.util.Scanner; //Importa a classe Scanner para receber entradas do usuário.

public class Mover {
    //Atributos
    int torre_O; //Variavel para guardar a torre de origem do movimento.
    int torre_D; //Variavel para guardar a torre de destino do movimento.
    Scanner entrada = new Scanner(System.in); //Cria o objeto entrada, classe scanner.
    Pilha<Pilha<Disco>> torre; //Variavel para pilha de controle.

    //Contrutores
    public Mover(Pilha<Pilha<Disco>> p) { //Recebe a pilha de controle do main.
        //Inicializa como 0.
        torre_O = 0; 
        torre_D = 0;

        //Guarda pilha de controle.
        torre = p;
    }
        
    //Métodos
    public void torre_origem() throws Exception{ //Método para receber a torre de origem e verificar se ela é válida.
        while (true) {
            //Recebe a entrada da torre de origem
            System.out.print("De qual torre você vai mover (1, 2 ou 3): ");
            torre_O = entrada.nextInt();

            //Valida se a torre de origem é valida
            if (torre_O > 3 || torre_O < 1) { //Torre inválida, se for maior que 3 ou menor que 1.
                System.out.printf("Torre invalida, escolha novemente\n");
            } else if (torre.percorrer(torre_O - 1).isEmpty() == true) { //Torre inválida se não tiver discos para mover.
                System.out.printf("Torre sem discos, escolha novemente\n");
            } else { //Qualquer outra situação ela é válida.
                break;
            } 
        }
    }
        
    public void torre_destino() throws Exception{ //Método para receber a torre de destino e verificar se ela é válida.
        while (true) {
            //Recebe a entrada da torre de destino
            System.out.print("Para qual torre você quer mover (1, 2, ou 3): ");
            torre_D = entrada.nextInt();

            //Valida se a torre de destino é valida
            if (torre_D > 3 || torre_D < 1) { //Torre inválida, se for maior que 3 ou menor que 1.
                System.out.printf("Torre invalida, escolha novemente.\n");
            } else if (torre.percorrer(torre_D - 1).isEmpty() == true) { //Se estiver vazia, então o movimento é válido.
                torre.percorrer(torre_D - 1).push(torre.percorrer(torre_O - 1).pop());
                System.out.print("Movimento realizado com sucesso.\n");
                break;

            //Verifica se disco na torre de origem é maior que disco na torre de destino.
            } else if (torre.percorrer(torre_O - 1).topo().getTamanho() > torre.percorrer(torre_D - 1).topo().getTamanho()) { 
                System.out.printf("Disco da torre de origem é maior do que o disco na torre de destino. Escolha novamente.\n");
            } else { //Qualquer outra situação, o movimento é válido.
                torre.percorrer(torre_D - 1).push(torre.percorrer(torre_O - 1).pop()); //Tira o disco da torre de origem e coloca na torre de destino.
                System.out.print("Movimento realizado com sucesso.\n");
                break;
            }
        }
    }

    //Método para verificar se o jogo foi resolvido.
    public boolean solucao(int quantidade) throws Exception { //Recebe a quantidade de movimentos realizados.
        if (torre.percorrer(2).isFull()) { //Verifica se a torre 3 está cheia.
            System.out.printf("Parabéns, você resolveu o problema em %d movimentos!\n", quantidade);
        }
        return torre.percorrer(2).isFull(); //retorna true ou false para o main.
    }    
}
