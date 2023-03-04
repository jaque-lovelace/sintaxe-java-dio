package dio.java.pan.operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        //operador ternário
        /* <expressão condicional> ? <caso condição seja true> : <caso condição seja false>*/

        int a, b;

        a = 5;
        b =6;

        /*String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);*/


        //passando o mesmo trecho para ternário

        //melão = verdadeiro e abacate = falso

        String resultado = a == b ? "melão" : "abacate";

        System.out.println(resultado);
    }
}
