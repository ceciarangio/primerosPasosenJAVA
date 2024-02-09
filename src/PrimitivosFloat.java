public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 1.0f; //para escribir con decimal, poner f tipo float
        System.out.println("realFloat: " + realFloat);

        float realFloat2 = 2120f;
        System.out.println("realFloat2: " + realFloat2);
        System.out.println("float correspondiente a byte = " + Float.BYTES);
        System.out.println("float correspondiente a bites = " + Float.SIZE);
        System.out.println("float valor maximo a Float = " + Float.MAX_VALUE);
        System.out.println("float valor minimo a Float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble: " + realDouble);
        System.out.println("double correspondiente a byte = " + Double.BYTES);
        System.out.println("double correspondiente a bites = " + Double.SIZE);
        System.out.println("double valor maximo a Double = " + Double.MAX_VALUE);
        System.out.println("double valor minimo a Double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416f; //para que sea el numero pi va escrito con f
        System.out.println("varFlotante: " + varFlotante);
    }
}
