public class Main {
    public static void main(String[] args)
    {
        coche micohe= new coche();
        micohe.incrementopuertas();
        System.out.println("El numero de puertas del coche es : "+ micohe.numeropuertas);
    }

      public static class  coche
    {
        int numeropuertas=3;
        public void incrementopuertas()
        {
                this.numeropuertas++;


        }

    }


}