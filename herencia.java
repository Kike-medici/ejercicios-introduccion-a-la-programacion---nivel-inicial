import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("");


            Cliente cliente=new Cliente();

        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese el nombre y apellido del cliente");
        cliente.nombre=scan.next();cliente.nombre2=scan.next();

        System.out.println("Ingrese la edad");
        cliente.edad=scan.nextInt();

        System.out.println("Ingrese el telefono");
        cliente.telefono=scan.nextLong();

        System.out.println("El monto del credito a pedir :");
        cliente.setCredito(scan.nextLong());

        System.out.println("Cliente:" + " "+ cliente.nombre + " " +cliente.nombre2);
        System.out.println("");
        System.out.println("Edadd :" + " "+ cliente.edad);
        System.out.println("");
        System.out.println("Numero telefonico:" + " "+ cliente.telefono);
        System.out.println("");
        System.out.println("Credito disponible :" + " "+ cliente.getCredito());

        System.out.println("");
        System.out.println("");


        Trabajador trabajador=new Trabajador();
        Scanner scann2 =new  Scanner(System.in);

        System.out.println("Ingrese el nombre y apellido del trabajador ");
        trabajador.nombre=scann2.next();trabajador.nombre2=scann2.next();

        System.out.println("Ingrese la edad");
        trabajador.edad=scann2.nextInt();

        System.out.println("Ingrese el telefono");
        trabajador.telefono=scann2.nextLong();

        System.out.println("El salario a cobrar :");
        trabajador.setSalario(scann2.nextLong());

        System.out.println("");
        System.out.println("");

        System.out.println("Trabajador :" + " "+ trabajador.nombre + " " +trabajador.nombre2);
        System.out.println("");
        System.out.println("Edadd :" + " "+ trabajador.edad);
        System.out.println("");
        System.out.println("Numero telefonico:" + " "+ trabajador.telefono);
        System.out.println("");
        System.out.println("Salario a cobrar :" + " "+ trabajador.getSalario());


    }
}

class Persona
{
    int edad;
    String nombre;
    String nombre2;
    Long telefono;

}

class Cliente extends Persona
{
    private long credito;

    public void setCredito(long credito)
    {
        this.credito=credito;

    }

    public long getCredito()
    {
        return this.credito;

    }

}

class Trabajador extends Persona
{
    private long salario;

    public void setSalario(long salario)
    {
        this.salario=salario;

    }

    public long getSalario()
    {
        return this.salario;

    }
}