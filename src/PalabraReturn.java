public class PalabraReturn {

    public static void main(String[] args) {

        var resultado = sumar(1,0);
        System.out.println("resultado = " + resultado);
    }
    //// var no se usa en un metodo tampoco en los argumentos se puede usar var

    public static int sumar (int a , int b) {
        if (a==0 && b==0){
            System.out.println("proporciona valores distintos a cero");
        }


       return a+b;

    }


}
