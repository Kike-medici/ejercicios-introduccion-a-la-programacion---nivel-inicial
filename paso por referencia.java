public class Main {
    public static void main(String[] args)
    {
        Coche coche=new Coche();
        cocheChanger(coche);
        cocheChanger(coche);
       // cocheChanger(coche);

        System.out.println(coche.velocidad);

    }

    public static void cocheChanger(Coche coche)
    {
        coche.velocidad=coche.velocidad + 50;

    }
}

class  Coche
{
    int velocidad=0;

}