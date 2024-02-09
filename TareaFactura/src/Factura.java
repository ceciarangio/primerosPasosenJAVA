import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        System.out.println("Ingresa el nombre del cliente: ");
        Scanner scanner = new Scanner(System.in); //in para recibir datos del usuario de la consola
        String clienteStr = scanner.nextLine();

        System.out.println("Ingresa nombre de producto: ");
        Scanner scannerproducto = new Scanner(System.in);
        String nombrProducto = scannerproducto.nextLine();

        System.out.println("Escribe precio del producto = ");
        Scanner scannerPrecio = new Scanner(System.in);
        //String precioProducto = scannerPrecio.nextLine();
        int numeroDecimal2 = 0; //valor por defecto
        try{
            numeroDecimal2 = scannerPrecio.nextInt();
        }
        catch (Exception e){ //o escribir InputMismatchException , es lo mismo
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0); // para que deje de ejecutar el catch, solo 1 vez
        }

        String mensaje = ("el cliente " + clienteStr + " " + "compro el producto: " + nombrProducto + "  " + "y su factura es: " + numeroDecimal2);
        System.out.println("mensaje = " + mensaje);
    }
}
