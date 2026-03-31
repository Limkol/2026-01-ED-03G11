public class JogoHanoi {
    public static void main (String[] args) throws Exception{
        System.out.print("Bem vindo ao jogo da Torre de Hanoi!\n");

        Inicio ini = new Inicio();
        int num_disc = ini.escolha_Num_Disc();
        Pilha<Pilha<Disco>> p = ini.cria_Jogo();
        int num = ini.menu();

        Mostrar mos = new Mostrar(num_disc, p);

        Mover mov = new Mover(p);

        int qtd = 0;

        while(num != 4) {
            if(num == 1) {
                mov.torre_origem();
                mov.torre_destino();
                if (mov.solucao(qtd) == true) {
                    break;
                }
                qtd++;

                num = ini.menu();
            } else if(num == 2) {
                mos.mostrar_torres();

                num = ini.menu();
            } else if(num == 3) {
                num_disc =ini.escolha_Num_Disc();
                p = ini.cria_Jogo();
                num = ini.menu();

                mos = new Mostrar(num_disc, p);

                mov = new Mover(p);

                qtd = 0;
            }
        }
        System.out.print("Obrigado por jogar!\n");
        System.exit(0);
    }
}