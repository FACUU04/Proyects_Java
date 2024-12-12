import java.util.Random;
import java.util.Scanner;

public class Juego_NumeroSecreto {
    public static void main(String[] args) {


        int intentos = 0;
        int numeroSecreto= new Random().nextInt(100);
        System.out.println(numeroSecreto);

        System.out.println("Juguemos a adivinar el numero secreto, escribe un numero entre 1 y 100" +
                " (tienes 5 intentos)");
        while (intentos < 5){
            Scanner teclado = new Scanner(System.in);
            int respuestaUser = teclado.nextInt();

            if (respuestaUser == numeroSecreto){
                System.out.println("FELCIDADESS GANASTEE. el numero era: "+numeroSecreto);
                break;

        } else if (respuestaUser > numeroSecreto) {
                System.out.println("Te fuistee largo, el numero secreto es mas chico");
                 intentos++;
            }  else {
                System.out.println("ASHH estuviste cerca, prueba otra vez, (pista, el numerosecreto es mayor)");
                intentos++;
            }
            while (intentos == 5){
                System.out.println("GAME OVER! limite de intentos, el numero secreto era "+ numeroSecreto);
                break;
            }

    }
    }
}
