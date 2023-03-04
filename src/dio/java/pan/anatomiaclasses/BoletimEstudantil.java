package dio.java.pan.anatomiaclasses;

public class BoletimEstudantil {
    public static void main (String[] args)
    {
        int mediaFinal = 8;
        if (mediaFinal < 6)
            System.out.println("reprovado");
        else if (mediaFinal==6)
        {
            System.out.println("prova minerva");

        }else
            System.out.println("aprovado");
    }
}
