package Logica_Automacao;

import java.util.Random;

public class Sensor {
    public static double lerSensor (String tag){
        Random gerador = new Random();
        //Gerar de fato um número entre 10.0 e 100.0 para simular a variação real de temperatura do processo
        double valorLido = 10.0 + (100.0 - 10.0) * gerador.nextDouble();
        return valorLido;
    }
}
