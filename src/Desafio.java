
import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {

        //Variables.
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

        int opcion = 0;

        //Adicionar los datos del cliente.
        System.out.println();
        System.out.println("***************************************");
        System.out.println("** Nombre del cliente: " + nombre + "    **");
        System.out.println("** Tipo de cuenta: " + tipoDeCuenta + "         **");
        System.out.println("** Saldo Disponible: $" + saldo + "        **");
        System.out.println("***************************************");
        System.out.println();

        //Menu de opciones.
        System.out.println("***************************************");
        String menu = """
                **      Selecciones una opcion       **
                ***************************************
                **    1 - Consulta de Saldo.         **
                **    2 - Retirar Saldo.             **
                **    3 - Depositar.                 **
                **    9 - Salir.                     **
                ***************************************
                """;
        //Instanciando la clase Scanner.
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("***************************************");
                    System.out.println("    Su saldo actual es de: $" + saldo);
                    System.out.println("***************************************\n");

                    break;
                case 2:
                    System.out.println("***************************************");
                    System.out.println("    Ingrese el monto a retirar: ");
                    System.out.println("***************************************\n");


                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("***************************************");
                        System.out.println("Saldo insuficiente");
                        System.out.println("***************************************\n");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("***************************************");
                        System.out.println("Saldo actual: $" + saldo);
                        System.out.println("***************************************\n");
                    }
                    break;
                case 3:
                    System.out.println("***************************************");
                    System.out.println("Ingrese el valor a depositar");
                    System.out.println("***************************************\n");
                    double valorDeposito = teclado.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("***************************************");
                    System.out.println("Saldo actual: " + saldo);
                    System.out.println("***************************************\n");
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        //Cerramos el Scanner.
        teclado.close();


    }
}
