import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("IF");
        System.out.println("ingrese el numero");
        Scanner scann = new Scanner(System.in);
        int numerolf = scann.nextInt();


        if (numerolf >= 0) {
            System.out.println("el numero es positivo :" + " " + numerolf);

        } else {
            System.out.println("el numero es negativo :" + " " + numerolf);

        }


        System.out.println("WHILE");
        System.out.println("ingrese el numero");
        Scanner scann1 = new Scanner(System.in);
        int numeroWhile = scann1.nextInt();

        while (numeroWhile < 3) {
            numeroWhile=numeroWhile+1;
            System.out.println(numeroWhile);

        }

        System.out.println("DO WHILE");
        System.out.println("ingrese el numero");
        Scanner scann2 = new Scanner(System.in);
        int numeroWhile2 = scann1.nextInt();

        do
        {
            numeroWhile2++;
            System.out.println(numeroWhile2);
        }
        while (numeroWhile2 < 3);

        System.out.println("FOR");

        int numerofor=0;

        for (int i=0;numerofor<=3;numerofor++)
        {
            System.out.println(numerofor);

        }

        System.out.println("SWITCH");
        System.out.println("");
        System.out.println("Ingrese la estacion");
        Scanner scann3=new Scanner(System.in);
        String estacion= scann3.next();

        switch (estacion)
        {
            case "verano":System.out.println("Estamos en verano ");
            break;

            case "otoño": System.out.println("Estamos en otoño ");
            break;

            case "invierno": System.out.println("Estamos en invierno ");
           break;

            case "primavera": System.out.println("Estamos en primavera ");
            break;

            default: System.out.println("NO ES UNA ESTACION");

        }

    }
}