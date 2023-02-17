public class Main {
    public static void main(String[] args)
    {
         var dia="martes";

        switch (dia)
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("hoy es laborable");
                break;

            case "sabado":
            case "domingo":
                System.out.println("hoy no es laborable");
                break;
        }
    }
}