package dio.java.pan.tiposandvariaveis;

public class TiposVariaveis
{
    public static void main(String[] args) throws Exception
    {
        //tipos de dados
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 9976545219L;
        float pi = 3.14F;
        double salarioMinimo = 2500.44;

        //Tipos de variáveis

            //1) casting -precisão maior para precisão menor
            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short)numeroNormal;

            //2) final (declarar variável como constante) -- o nome da varíável deve estar em CAIXA ALTA e antes do tipo deve estar sinalizado como final
           final int NUMERO = 1;




    }
}
