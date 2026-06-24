package aulajava;

public class Aula04_SwitchCase {
    public static void main (String [] args) {
        int opcaoMenu = 2; 

        switch (opcaoMenu) {
            case 1 : 
            System.out.println("Iniciando");
            break;
            case 2 : 
            System.out.println("Carregando jogo salvo");
            break;
            case 3 :
                System.out.println("Saindo do programa");
                break;
        }
    }
}