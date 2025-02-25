package scr;

import java.util.Scanner;

public class jogo {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        int EscolhaP1 = Player1();
        int EscolhaP2 = Player2();
        ValidarVencedor(EscolhaP1, EscolhaP2);
        }



    

    public static int Player1(){

        System.out.println("Escolha o que desejar: ");
        System.out.println("1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");
        int EscolhaP1 = ler.nextInt();



        return(EscolhaP1);
    }

    public static int Player2(){

        System.out.println("Escolha o que desejar: ");
        System.out.println("1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");
        int EscolhaP2 = ler.nextInt();



        return(EscolhaP2);
    }

    public static void ValidarVencedor(int P1, int P2){

        String Vencedor = "";

        if(P1 != P2){
        if (P1 == 1 && P2 == 3){
            Vencedor = "P1";
            System.out.println("O vencedor foi o jogador 1");
        } else if (P1 == 2 && P2 == 1){
            Vencedor = "P1";
            System.out.println("O vencedor foi o jogador 1");
        } else if (P1 == 3 && P2 == 2){
            Vencedor = "P1";
            System.out.println("O vencedor foi o jogador 1");
        } else {
            Vencedor = "P2";
            System.out.println("O vencedor foi o jogador 2");
        }
    } else {
        Vencedor = "TIE";
        System.out.println("O jogo deu empate");
    }


    }

}