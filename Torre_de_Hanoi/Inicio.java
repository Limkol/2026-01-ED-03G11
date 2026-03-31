import java.util.Scanner;

public class Inicio { 
    
    //Atributos
    int num_Discos;
    Scanner entrada = new Scanner(System.in);

    //Construtores
    public Inicio() {
        num_Discos = 0;
    }

    //Métodos
    public int escolha_Num_Disc() {
        while (true) {
        System.out.print("Escolha um numero entre 1 e 7 para a quantidade de discos: ");
        num_Discos = entrada.nextInt();
        if (num_Discos < 8 && num_Discos > 0) {
            return num_Discos;
        }
        System.out.printf("Número de discos inválido, escolha novamente\n");
        }
    }

    public Pilha<Pilha<Disco>> cria_Jogo() throws Exception {
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
        return p;
    }
    
    public int menu() {
        while (true) {
            System.out.print("---Menu---\n1- Mover disco\n2- Mostrar torres\n3- Reiniciar jogo\n4- Sair\n");
            System.out.print("Escolha uma opção: ");
            int num = entrada.nextInt();
            if (num < 5 && num > 0) {
                return num;
            }
            System.out.print("A opção escolhida não existe, por favor escolha outra.\n");
        }
    }
}