package dio.java.pan.metodos;

import java.sql.SQLOutput;

public class Usuario {
    public static void main(String[] args) throws  Exception{
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        
        System.out.println("Tv ligada?: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada?" + smartTv.ligada);
    }
}
