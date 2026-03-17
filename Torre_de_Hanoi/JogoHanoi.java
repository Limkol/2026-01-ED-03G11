/*Representa o main.
Responsável pelo controle do jogo.*/

import java.util.Scanner;

public class JogoHanoi {
    public static void main(String[] args) throws Exception {
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
        //Texto do menu
        String menu = "---Menu---\n1- Mover disco\n2- Mostrar torres\n3- Reiniciar jogo\n4- Sair\n";
        //Criando scanner da entrada do usuario
        Scanner entrada = new Scanner(System.in);
        //Printando o meno para o usuario e recebendo a entrada dele
        System.out.printf("%s", menu);
        System.out.print("Escolha uma opção:");
        int num = entrada.nextInt();

        

    }
}