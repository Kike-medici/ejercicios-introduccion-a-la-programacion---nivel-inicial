import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("ingrese el numero de puertas");
        Scanner scan = new Scanner(System.in);
        int cantpuertas=scan.nextInt();
        coche micoche=new coche();
        System.out.println("El numero de puertas del coche es : "+micoche.incrementopuertas(cantpuertas));
    }

    public static class  coche
    {
        public  static  int  incrementopuertas(int puertas)
        {
            return puertas+1;
        }

    }
}