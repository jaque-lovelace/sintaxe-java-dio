package dio.java.pan.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2)
        {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);
    }
}
