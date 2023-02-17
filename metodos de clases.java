public class Main {
    public static void main(String[] args)

    {
        Coche coche=new Coche();
       // Moto moto=new Moto();

        ejecutaracelerar(coche);
        //ejecutaracelerar(moto);

    }

    public static void ejecutaracelerar(Vehiculo vehiculo)
    {
        vehiculo.acelerar(50);

    }

}
interface Vehiculo
{
    void acelerar (int cuantaVelocidad);
    void frenar(int cuantaVelocidad);

}
class Coche implements Vehiculo
{
    public void acelerar (int cuantaVelocidad)
    {
        System.out.println("Coche acelerando");
    }
    public void frenar(int cuantaVelocidad)
    {
        System.out.println("Coche frenando");

    }


}

class Moto implements Vehiculo
{
    public void acelerar (int cuantaVelocidad)
    {
        System.out.println("moto acelerando");
    }
    public void frenar(int cuantaVelocidad)
    {
        System.out.println("moto frenando");

    }


}