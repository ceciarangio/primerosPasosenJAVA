public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; //el valor real es 98.76543
        float f = 1.2345e2f; // el valor real es 123.45

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1; //2 = es para comparar
        System.out.println("esIgual = " + esIgual);
    }
}
