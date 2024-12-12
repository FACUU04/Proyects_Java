import java.util.Scanner;

public class ProgramaBanco {
    public static void main(String[] args) {

        String cliente = "Lautaro sosa";
        String Tipocuenta = "corriente";
        double saldo = 700;
        int opcion = 0;


        System.out.println("***********************");
        System.out.println("Cliente: "+ cliente);
        System.out.println("Tipo de cuenta: " + Tipocuenta);
        System.out.println("Saldo disponible US$" +saldo);
        System.out.println("***********************");


        String menu = """
                ***Escriba el numero de la operacion que desea realizar***
                1- Consultar saldo
                2- Retirar
                3- Depositar
                9- Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
           opcion = teclado.nextInt();

           switch (opcion){
               case 1:
                   System.out.println("El saldo actual es US$ "+saldo);
                   break;

               case 2:
                   System.out.println("Ingrese el monto que desea retirar");
                   double valorRetiro = teclado.nextDouble();
                   if (valorRetiro > saldo){
                       System.out.println("saldo insuficiente");
                   }else{
                       saldo = saldo - valorRetiro;
                       System.out.println("El saldo actualizado es: US$"+ saldo);
                   }
                   break;

               case 3:
                   System.out.println("Ingrese el monto a depositar");
                   double valorDeposito = teclado.nextDouble();
                   saldo += valorDeposito;
                   System.out.println("El saldo actualizado es: US$ " + saldo);
                   break;

               case 9:
                   System.out.println("Cerrando sesion, Gracias por usar nuestros servicios");
                   break;

               default:
                   System.out.println("E1 (Opcion no valida)");


            }
        }

    }
}
