public class Main {
    public static void main(String[] args)
    {

        //factorial(8);
        suma(5,10);
    }

    //public static int factorial(int numero)
    {

        //int resultado;

        //if(numero ==1)
       // {
       //     return 1;
        //}
        //resultado=factorial(numero-1)*numero;
        // return resultado;

    }

    //SE LLAMA A SI MISMO UNA Y OTRA VEZ
    public  static int suma(int a, int b)
    {
        var temp=a+b;
        System.out.println("valor de A "+ a +"valor de B "+b+"valor de TEMP "+temp);
        return suma(a,temp);

    }
}