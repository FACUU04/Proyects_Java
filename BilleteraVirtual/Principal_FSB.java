import java.util.Collections;
import java.util.Scanner;

public class Principal_FSB {
    public static void main(String[] args) {

        String usuario = "Lautaro";

        System.out.println("Bienvenid@ "+usuario);


        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el limite que planea gastar");
        double limite = lectura.nextDouble();
        FSBilletera_virtual billetera = new FSBilletera_virtual(limite);

        int Salir = 1;
        while (Salir != 0){
            System.out.println("Escriba la descripcion de la compra");
            String descripcion = lectura.next();

            System.out.println("Escriba el valor de la compra");
            double valor = Double.valueOf(lectura.next());

            Compra_FSB compra = new Compra_FSB(valor, descripcion);
            boolean compraRealizada = billetera.lanzarCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada con exito!");
                System.out.println("Que lo disfrutes");
                System.out.println("Saldo actualizado: "+billetera.getSaldo());
                System.out.println("Selecciona 0 si deseas salir, o 1 para seguir comprando ;)");
                Salir = lectura.nextInt();
            } else {
                System.out.println("Compra CANCELADA");
                System.out.println("saldo insuficiente :(");
                Salir = 0;
            }
        }

        System.out.println("*********************");
        System.out.println("Compras realizadas:");
        //Ordenar lista
        Collections.sort(billetera.getListaDeCompras());
        for (Compra_FSB compra : billetera.getListaDeCompras()){
            System.out.println(compra.getDescripcion() + "-" + compra.getValor());
        }
        System.out.println("*********************");
        System.out.println("Tu saldo actual: "+ billetera.getSaldo());

    }
}
