/*Representa o main.
Responsável pelo controle do jogo.*/

import java.util.Scanner;

public class JogoHanoi {

    public static void inicio() throws Exception {
        //Criando as torres 
        Pilha<Disco> t1 = new Pilha<Disco>(5);
        Pilha<Disco> t2 = new Pilha<Disco>(5);
        Pilha<Disco> t3 = new Pilha<Disco>(5);

        //Criando os discos
        Disco d1 = new Disco(1);
        Disco d2 = new Disco(2);
        Disco d3 = new Disco(3);
        Disco d4 = new Disco(4);
        Disco d5 = new Disco(5);

        //Colocando os discos na torre 1 para começar o jogo
        t1.push(d1);
        t1.push(d2);
        t1.push(d3);
        t1.push(d4);
        t1.push(d5);
    }

    public static void menu() throws Exception {
        //Texto do menu
        String menu = "---Menu---\n1- Mover disco\n2- Mostrar torres\n3- Reiniciar jogo\n4- Sair\n";
        
        //Criando scanner da entrada do usuario
        Scanner entrada = new Scanner(System.in);

        //Printando o menu para o usuario e recebendo a entrada dele
        System.out.printf("%s", menu);
        System.out.print("Escolha uma opção:");
        int num = entrada.nextInt();

        //Compara se a entrada numerica do usuario é valida
        if(num == 1) {
            mover();
        } else if(num == 2) {
            mostrar();
        } else if(num == 3) {
            main();
        } else if (num == 4) {
            System.exit(0);
        } else {
            System.out.print("O opção escolhida não existe, por favor escolha outra.\n");
            menu();
        }
    }

    public static void mover() {
        Scanner entrada_1 = new Scanner(System.in);
        Scanner entrada_2 = new Scanner(System.in);
        System.out.print("De qual torre você vai mover");
        int torred = entrada_1.nextInt();
        System.out.print("Para qual torre você quer mover");
        int torrep = entrada_2.nextInt();
    }

    public static void mostrar() {

    }

    public static void main() throws Exception {
        //Inicio o código criando as torres e os discos para o jogo
        inicio();

        //Exibe o menu ao usuario para ele começar o jogo
        menu();

    }
}