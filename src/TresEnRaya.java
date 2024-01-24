import java.util.Scanner;
public class TresEnRaya {
    private static char tablero[] = new char [9];
    private static int victorias=0 , derrotas = 0 ;
    private static final char charUsuario = 'X', charMaquina ='o';

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int opcion=0;
        do {
            System.out.println("MENU");
            System.out.println("1. Jugar");
            System.out.println("2. Ver estatísticas");
            System.out.println("0. Salir");

        } while (opcion!=0);
    }
}
