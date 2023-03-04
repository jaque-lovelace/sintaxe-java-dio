package dio.java.pan.operadores;

import java.sql.SQLOutput;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //qual resultado das expressões abaixo?

           // concatenação = String
            String nomeCompleto = "Linguagem" + "Java";
            System.out.println(nomeCompleto);

            //concatenação int + string
           String concatenacao = 1 + 1 + 1 +"1";
           System.out.println(concatenacao);

            concatenacao = 1 + "1" + 1 + 1 ;
            System.out.println(concatenacao);

            concatenacao = "1" + 1 + 1 + 1 ;
            System.out.println(concatenacao);

            concatenacao = "1" + (1+1+1);
            System.out.println(concatenacao);


    }
}
