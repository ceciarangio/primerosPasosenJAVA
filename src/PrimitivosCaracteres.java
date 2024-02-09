public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'A';
        System.out.println("caracter " + caracter);

        char caracter2 = '\u0040'; //para hacer el arroba , buscar mapa de caracter en windows
        System.out.println("caracter2 " + caracter2);

        char decimal = 64;
        System.out.println("decimal " + decimal);
        System.out.println("decimal = caracter2 " + (decimal == caracter2));

        char simbolo = '@';
        System.out.println("simbolo " + simbolo);

        //se pueden usar directamente sin guardar en variables ni poniendo ''
        char espacio = ' ';
        char retroceso = '\b'; //sirve para eliminar un caracter, retroceder un espacio
        char tabulador = '\t'; //para hacer espaco de tabulacion, espacio mas amplio
        char nuevaLinea = '\n'; //para continuar escribiendo abajo , salto de linea
        char retornoCarro = '\r'; //


        System.out.println("char corresponde en byte : " + Character.BYTES);
        System.out.println("char corresponde en bites : " + Character.SIZE);
        System.out.println("char maximo  : " + Character.MAX_VALUE);
        System.out.println("char minimo : " + Character.MIN_VALUE);

    }
}
