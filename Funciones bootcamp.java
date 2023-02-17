
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("ingrese 3 numeros");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        System.out.print(suma(numero, numero1, numero2)+"  ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("ingrese el numero de puertas");
        Scanner scan1 = new Scanner(System.in);
        int cantpuertas = scan.nextInt();
        coche micoche = new coche();
        System.out.println("El numero de puertas del coche es : " + micoche.incrementopuertas(cantpuertas));
    }

    public static  int  suma(int numero, int numero1, int numero2) {
        int suma3 = numero + numero1 + numero2;
        return suma3;
    }

    public static class coche
    {
        public static int incrementopuertas(int puertas) {
            return puertas + 1;


        }





    }
}