package dio.java.pan.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2)
        {
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2)
        {
            System.out.println("pelo menos uma das duas condições é verdadeiras");
        }
        System.out.println("fim");

    }
}