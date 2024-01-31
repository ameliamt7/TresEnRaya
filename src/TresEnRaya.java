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
            try {
                System.out.println("Seleccionar opcion(1-2) o 0 para salir");
                opcion = 100;
            } catch (InputMismatchExcepcion ime) {
                opcion = 100;
            }
            input.nextLine();
            switch (opcion) {
                case 1:
                    jugar(input);
                    break;
                case 2:
                    System.out.println("Victorias:"+victorias);
                    System.out.println("Derrotas:"+derrotas+"\n");
                    break;
                caso 0:
                    System.out.println("Fin de programa\n");
                    break;
                default:
                    System.out.println("Opción no válida \n");
                    break;
            }
        } while (opcion!=0);
        input.close();

    }
}
