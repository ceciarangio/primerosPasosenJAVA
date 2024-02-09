import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la factura: ");
        String facturaDetalle = scanner.nextLine();

        System.out.println("Precio del producto 1 = ");
        double precio1 = scanner.nextDouble();

        System.out.println("Precio del producto 2 = ");
        double precio2 = scanner.nextDouble();

        double sumaProductos = (precio1 + precio2);
        System.out.println("suma de Productos = " + sumaProductos);

        double valorImpuesto = 0.19;

        double conImpuesto = (sumaProductos * valorImpuesto);
        double sumaConImpuesto = (conImpuesto + sumaProductos);


        double pasoaStringSuma = sumaProductos;
        String Otro = Double.toString(pasoaStringSuma);

        double pasoaStringImpuesto = conImpuesto;
        String Otro2 = Double.toString(pasoaStringImpuesto);

        double pasoaStringTotal = sumaConImpuesto;
        String Otro3 = Double.toString(pasoaStringTotal);

        System.out.println("La factura " + facturaDetalle + " tiene un total bruto de: " + Otro + ", con un impuesto de " + Otro2 + " y el monto despues de impuesto es de " + Otro3 );
        
    }
}
