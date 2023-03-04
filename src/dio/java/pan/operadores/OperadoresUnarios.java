package dio.java.pan.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        // (+) operador unário de valor positivo
        int numero = 1; // não precisa declarar

        //(-) operador unário de valor negativo
        int numero1 = -1;


        //como tornar um valor que era negativo em positivo

        System.out.println(numero1 * -1);

        //(++) operador unário de incremento de valor - incrementa o valor em 1 unidade
            numero++;


        //(--) operador unário de decremento de valor - decrementa o valor em 1 unidade
             numero--;

        //(!) operador lógico booleano de negação
        boolean variavel = true;

        variavel= !variavel;

        System.out.println(variavel);

    }
}
