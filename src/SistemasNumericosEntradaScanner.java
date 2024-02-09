import javax.swing.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //in para recibir datos del usuario de la consola
        System.out.println("debe ingresar un numero entero");
        String numeroStr = scanner.nextLine(); //obtener la linea que el usuario ingresa

        int numeroDecimal2 = 0; //valor por defecto
        try{
            numeroDecimal2 = scanner.nextInt();
        }
        catch (Exception e){ //o escribir InputMismatchException , es lo mismo
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0); // para que deje de ejecutar el catch, solo 1 vez
        }

        System.out.println("numeroDecimal2 = " + numeroDecimal2);

        String mensaje = "numero binario de = " + numeroDecimal2 + " = " + Integer.toBinaryString(numeroDecimal2);
        mensaje += "\nnumero octal de  = " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2);
        mensaje += "\nnumero hexadecimal de  = " + numeroDecimal2 + " = " + Integer.toHexString(numeroDecimal2);
        System.out.println(mensaje);
    }
}
