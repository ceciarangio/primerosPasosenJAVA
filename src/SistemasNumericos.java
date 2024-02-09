import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {


       /* String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero"); //para ingresar datos a la app
        int numeroDecimal = Integer.parseInt(numeroStr);*/
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b111110100; //poner 0b para que corresponda a un sistema binario
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; //se pone 0 antes del numero para que sea numero octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; //se antepone 0x para decirle que es num hexadecimal
        System.out.println("numeroHex = " + numeroHex);


        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero"); //para ingresar datos a la app desde una ventana emergente
        int numeroDecimal2 = 0; //valor por defecto
        try{
            numeroDecimal2 = Integer.parseInt(numeroStr);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            System.exit(0); // para que deje de ejecutar el catch, solo 1 vez
        }

        System.out.println("numeroDecimal2 = " + numeroDecimal2);

        String mensaje = "numero binario de = " + numeroDecimal2 + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de  = " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero hexadecimal de  = " + numeroDecimal2 + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
