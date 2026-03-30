//Testando a opção 2 do menu
import java.util.Scanner;

public class teste_Op_2 {
    public static void main() throws Exception {
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
        t1.push(d5);
        t1.push(d4);
        t1.push(d3);
        t1.push(d2);
        t1.push(d1);

        //Texto do menu
        String menu = "---Menu---\n1- Mover disco\n2- Mostrar torres\n3- Reiniciar jogo\n4- Sair\n";
        
        //Criando scanner da entrada do usuario
        Scanner entrada = new Scanner(System.in);

        //Printando o menu para o usuario e recebendo a entrada dele
        System.out.printf("%s", menu);
        System.out.print("Escolha uma opção: ");
        int num = entrada.nextInt();

        //Compara se a entrada numerica do usuario é valida
        if(num == 1) { //Se entrada igual a 1, chama função mover
            //mover();
        } else if(num == 2) { //Se entrada igual a 2, exibe as torres com os discos
            for (int i = 0; i < t1.tamanho(); i++) {
                //Se a posição atual é igual ou menor que a quantidade de elementos na pilha, então vai mostrar o elemento
                if (t1.tamanho() - i <= t1.quantidade()){
                    System.out.printf("%s", t1.percorrer(i).getImagem());
                } else { //Se não, então vai dar espaço para exibir o elemento na proxima pilha
                    System.out.printf("        ");
                }
                //Se a posição atual é igual ou menor que a quantidade de elementos na pilha, então vai mostrar o elemento
                if (t2.tamanho() - i <= t2.quantidade()){
                    System.out.printf("%s", t2.percorrer(i).getImagem());
                } else { //Se não, então vai dar espaço para exibir o elemento na proxima pilha
                    System.out.printf("        ");
                }
                //Se a posição atual é igual ou menor que a quantidade de elementos na pilha, então vai mostrar o elemento
                if (t3.tamanho() - i <= t3.quantidade()){
                    System.out.printf("%s\n", t3.percorrer(i).getImagem());
                } else { //Se não, então vai dar espaço e enter para exibir o elemento na primeira pilha
                    System.out.printf("        \n");
                }
            }
            System.out.printf("TORRE_1 TORRE_2 TORRE_3\n");
        } else if(num == 3) {
            //main();
        } else if (num == 4) {
            System.exit(0);
        } else {
            System.out.print("O opção escolhida não existe, por favor escolha outra.\n");
            //menu();
        }
        
    }
}