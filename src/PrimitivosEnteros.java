public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte: " + numeroByte );
        System.out.println("tipo de byte que corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo de byte que corresponde en bites a: " + Byte.SIZE);
        System.out.println("tipo de byte en valor maximo bites a: " + Byte.MAX_VALUE);
        System.out.println("tipo de byte en valor minimo  bites a: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort: " + numeroShort);
        System.out.println("tipo de Short que corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo de Short que corresponde en bites a: " + Short.SIZE);
        System.out.println("tipo de Short en valor maximo Short a: " + Short.MAX_VALUE);
        System.out.println("tipo de Short en valor minimo  Short a: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("tipo de Int que corresponde en byte a: " + Integer.BYTES);
        System.out.println("tipo de Int que corresponde en bites a: " + Integer.SIZE);
        System.out.println("tipo de Int en valor maximo Int a: " + Integer.MAX_VALUE);
        System.out.println("tipo de Int en valor minimo  Int a: " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L; //para agregar numero mas alto, se agrega la letra L
        System.out.println("numeroLong: " + numeroLong);
        System.out.println("tipo de Long que corresponde en byte a: " + Long.BYTES);
        System.out.println("tipo de Long que corresponde en bites a: " + Long.SIZE);
        System.out.println("tipo de Long en valor maximo Long a: " + Long.MAX_VALUE);
        System.out.println("tipo de Long en valor minimo  Long a: " + Long.MIN_VALUE);

        var numeroVar = 127; //valor numerico entero hasta int 2147483647 , sino agregarle la L o F si supera aun mas


    }
}
