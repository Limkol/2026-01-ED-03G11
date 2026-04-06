/*
Integrantes do Grupo:
Guilherme Longo RA: 10736785
Gustavo Francisco Toito RA: 10438660
Helen Santana de Araujo Teixeira RA: 10742524
 */
/*Classe principal do código, com o objetivo juntar e 
controlar todas as outras classes */

public class JogoHanoi {
    public static void main (String[] args) throws Exception{
        System.out.print("Bem vindo ao jogo da Torre de Hanoi!\n"); //Inicia com uma mensagem de boas vindas

        //Inicializa todas os metodos para o inicio do jogo.
        Inicio ini = new Inicio();
        int num_disc = ini.escolha_Num_Disc();
        Pilha<Pilha<Disco>> p = ini.cria_Jogo();
        int num = ini.menu();

        //Inicia a classe para mostrar as torres.
        Mostrar mos = new Mostrar(num_disc, p);

        //Inicia a classe para mover os discos.
        Mover mov = new Mover(p);

        //Variavel para contar a quantidade de movimentos realizados.
        int qtd = 0;

        //Loop para controlar o menu.
        while(num != 4) { //Enquanto o usuário não escolher a opção de sair, o programa continua rodando.
            if(num == 1) { //Opção de mover os discos.
                qtd++; //Soma a quantidade de movimentos realizados.

                //Chama os métodos para realizar o movimento.
                mov.torre_origem();
                mov.torre_destino();

                //Verifica se o jogo foi resolvido.
                if (mov.solucao(qtd) == true) { //Passa o quantidade de movimentos para o método.
                    break; //Encerra o loop.
                }

                num = ini.menu(); //Exibe o menu novamente.

            } else if(num == 2) { //Opção de mostrar as torres.
                
                mos.mostrar_torres();//Chama o método para mostrar as torres.

                num = ini.menu();  //Exibe o menu novamente.

            } else if(num == 3) { //Opção de reiniciar o jogo.

                num_disc =ini.escolha_Num_Disc(); //Chama o método para escolher a quantidade de discos novamente.
                p = ini.cria_Jogo(); //Chama o método para criar o jogo com as novas configurações.
                num = ini.menu(); //Exibe o menu novamente.

                mos = new Mostrar(num_disc, p); //Reinicia a classe para mostrar as torres.

                mov = new Mover(p); //Reinicia a classe para mover os discos.

                qtd = 0; //Reinicia a quantidade de movimentos para 0.
            }
        }
        System.out.print("Obrigado por jogar!\n");
        System.exit(0); //Encerra o programa.
    }
}