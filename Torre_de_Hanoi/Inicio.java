/*Classe para representar as configurações iniciais do jogo, que precisam ser
repetidas ao selecionar a opção reiniciar*/

import java.util.Scanner; //Importa a classe Scanner para receber entradas do usuário.

public class Inicio { //Cria a classe chamada Inicio.
    
    //Atributos
    int num_Discos; //Serve para guardar a quantidade de discos usados no jogo.
    Scanner entrada = new Scanner(System.in); //Cria um objeto da classe Scanner para receber entradas do usuário.

    //Construtores
    public Inicio() {
        num_Discos = 0; //Define o valor da variavel como 0.
    }

    //Métodos
    public int escolha_Num_Disc() { //Metodo para receber a quantidade de discos que serão usados no jogo.
        while (true) { //Usado para que enquanto o usuário não digitar um valor válido, o programa continue pedindo uma nova entrada.
        System.out.print("Escolha um numero entre 1 e 7 para a quantidade de discos: ");
        num_Discos = entrada.nextInt(); //Guarda a entrado do usuario em num_Discos.
        if (num_Discos < 8 && num_Discos > 0) { //Se num_Discos for menor que 8 e maior que 0.
            return num_Discos; //Retorna o valor para o main e encerra o método.
        }
        System.out.printf("Número de discos inválido, escolha novamente\n");
        }
    }

    public Pilha<Pilha<Disco>> cria_Jogo() throws Exception { //Metodo para criar as torres e os discos.
        Pilha<Pilha<Disco>> p = new Pilha<Pilha<Disco>>(3); //"Pilha de controle" uma pilha para guardar as outras pilhas.

        //Cria as 3 pilhas/torres do jogo.
        Pilha<Disco> t1 = new Pilha<Disco>(num_Discos);
        Pilha<Disco> t2 = new Pilha<Disco>(num_Discos);
        Pilha<Disco> t3 = new Pilha<Disco>(num_Discos);

        //Insere as pilhas em uma outra pilha para facilitar o acesso.
        p.push(t3);
        p.push(t2);
        p.push(t1);

        //Loop para criar os discos conforme a quantidade escolhida pelo usuario.
        for (int i = num_Discos; i > 0; i--) {
            Disco d = new Disco(i);
            t1.push(d); //Insere o disco na pilha.
        }
        return p; // retorna a pilha de controle para o main.
    }
    
    public int menu() { //Metodo para exibir o menu e receber a escolha do usuário.
        while (true) { //Enquanto o valor for inválido, o programa fica em loop.
            System.out.print("---Menu---\n1- Mover disco\n2- Mostrar torres\n3- Reiniciar jogo\n4- Sair\n");
            System.out.print("Escolha uma opção: ");
            int num = entrada.nextInt();
            if (num < 5 && num > 0) { //Se num for maior que 0 e mmenor que 5.
                return num; //Retorna o valor para o main e encerra o método.
            }
            System.out.print("A opção escolhida não existe, por favor escolha outra.\n");
        }
    }
}