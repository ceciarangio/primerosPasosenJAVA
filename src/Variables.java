public class Variables {
    public static void main(String[] args){
        String nombre = "Cecilia";
        System.out.println("Mi nombre es " + nombre);

        int numero = 10;
        System.out.println("numero: " + numero);

        int numero2 = 15;
        boolean valor = true;
        if(valor){ //aqui le cambio el valor a numero2
            System.out.println("numero: " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 : " + numero2); //me imprime 10

        var numero3 = "15"; //funciona como JS

        String apellido; //puedo definirla sin valor

        apellido = "Arangio";

        if(numero > 10){
            apellido = "Ferri";
        }
        System.out.println("apellido: " + apellido);


    }


}
