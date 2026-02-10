package Logica_Automacao;
import java.util.Random;

/*
  PROJETO: Coletor de Dados de Automação
  OBJETIVO: Exemplificar:
                - Coleta;
                - Tratamento; e
                - Validação de dados industriais.
 */

public class Main {
    //O metodo "Main" é o ponto de partida. Tudo começa aqui!
    public static void main(String[] args) {

        //Exibição do cabeçalho: simula a inicialização de um sistema de informação
        System.out.println("=================================================");
        System.out.println("|   SISTEMA DE MONITORAMENTO INDUSTRIAL - V01   |");
        System.out.println("=================================================");

        //Criação de um laço (loop) para repetir a coleta 5 vezes
        //Isso é somente uma simulação, na vida real isso rodaria infinitamente para monitorar a máquina
        for (int i = 1; i <= 5; i++){
            System.out.println("\nLendo os dados do processo - Ciclo " + i);

            //1. Coleta de Dados
            double valorTemp = lerSensor("Temperatura_F01");

            //2/3. Tratamento e Validação
            validarSeg("Temperatura", valorTemp, 20.0, 80.0);

            //Adiciona um temporizador
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println("ERRO NO TEMPORIZADOR!");
            }
        }
        System.out.println("\n============================================");
        System.out.println("|        COLETA DE DADOS FINALIZADA        |");
        System.out.println("============================================");
    }

    //Metodo Especial 1
    public static double lerSensor (String tag){
        Random gerador = new Random();
        //Gerar de fato um número entre 10.0 e 100.0 para simular a variação real de temperatura do processo
        double valorLido = 10.0 + (100.0 - 10.0) * gerador.nextDouble();
        return valorLido;
    }

    //Metodo Especial 2
    public static void validarSeg(String nomeSensor, double valor, double min, double max){
        //Exibir o valor formatado com 2 casas decimais
        System.out.printf("Sensor: %s | Valor Atual: %.2f ºC\n", nomeSensor, valor);

        //Lógica de Programação
        if (valor >= min && valor <= max) {
            System.out.println(" >> OPERAÇÃO NORMAL << ");
        } else {
            System.out.println(" >> FORA DOS NÍVEIS DE SEGURANÇA << ");
        }
    }
}