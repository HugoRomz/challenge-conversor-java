import org.w3c.dom.ls.LSException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConsultarMoneda cambioDivisa = new ConsultarMoneda();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        var valorConversion = 0.0;
        boolean salir = false;

        List<String> listaMonedas = Arrays.asList("USD", "MXN", "BRL", "CLP", "EUR", "BOB");

        while (!salir){
            mostrarMenu();
            System.out.print("Elija una opción válida: \n");

            if (teclado.hasNextInt()){
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        String monedaOrigen = seleccionarMoneda(teclado, listaMonedas, "origen");
                        if (monedaOrigen == null) break;

                        String monedaDestino = seleccionarMoneda(teclado, listaMonedas, "destino");
                        if (monedaDestino == null) break;

                        System.out.println("Ingresa el monto a cambiar");
                        if (teclado.hasNextDouble()) {
                            valorConversion = teclado.nextDouble();
                            teclado.nextLine();
                            cambioDivisa.cambioMoneda(monedaOrigen, monedaDestino, valorConversion);
                            System.out.println(cambioDivisa);
                        } else {
                            System.out.println("Monto inválido. Por favor, ingresa un número válido.");
                            teclado.nextLine();
                        }
                        break;
                    case 2:
                        List<String> historial = cambioDivisa.consultarHistorial();
                        if (historial.isEmpty()) {
                            System.out.println("No hay conversiones en el historial.");
                        } else {
                            System.out.println("Historial de Conversiones:");
                            for (String record : historial){
                                System.out.println(record);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elija una opción entre 1 y 3.");
                }
            }else {
                System.out.println("No válido, ingrese correctamente el numero según la opción deseada.");
                teclado.nextLine();
            }
        }
        teclado.close();


    }

    private static void mostrarMenu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|   Sea bienvenido/a al Conversor de monedas :3   |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| 1) Realizar Conversión de Moneda                |");
        System.out.println("| 2) Consultar Historial                          |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| 3) Salir                                        |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static String seleccionarMoneda(Scanner teclado, List<String> monedas, String tipo) {
        System.out.println("Seleccione la moneda de " + tipo + ":");
        for (int i = 0; i < monedas.size(); i++) {
            System.out.println((i + 1) + ") " + monedas.get(i));
        }
        System.out.print("Opción: ");
        if (teclado.hasNextInt()) {
            int seleccion = teclado.nextInt();
            teclado.nextLine();
            if (seleccion >= 1 && seleccion <= monedas.size()) {
                return monedas.get(seleccion - 1);
            } else {
                System.out.println("Selección inválida. Por favor, elija una opción válida.");
                return null;
            }
        } else {
            System.out.println("Entrada no válida. Por favor, ingresa un número correspondiente a una opción.");
            teclado.nextLine();
            return null;
        }
    }

}
