import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Persona persona=new Persona();


        System.out.println("Ingrese el nombre");
        Scanner scan= new Scanner(System.in);
        persona.setNombre(scan.next());

        System.out.println("Ingrese la edad");
        persona.setEdad(scan.nextInt());

        System.out.println("Ingrese el numero de telefono");
        persona.setNumerotelefono(scan.nextLong());

        System.out.println("El nombre de la persona es : " + persona.getNombre());
        System.out.println("La edad de la persona es : " + persona.getEdad());
        System.out.println("El numero de telefono  de la persona es : " + persona.getNumerotelefono());




    }
}
class  Persona
{
    private String nombre;
    private int edad;
    private long numerotelefono;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumerotelefono(long numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getNumerotelefono() {
        return numerotelefono;
    }
}