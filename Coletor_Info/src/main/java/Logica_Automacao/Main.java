package Logica_Automacao;

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

        Sensor sensor = new Sensor();
        Seguranca seguranca = new Seguranca();

        //Criação de um laço (loop) para repetir a coleta 5 vezes
        //Isso é somente uma simulação, na vida real isso rodaria infinitamente para monitorar a máquina
        for (int i = 1; i <= 5; i++){
            System.out.println("\nLendo os dados do processo - Ciclo " + i);

            //1. Coleta de Dados
            double valorTemp = sensor.lerSensor("Temperatura_F01");

            //2/3. Tratamento e Validação
            seguranca.validarSeg("Temperatura", valorTemp, 20.0, 80.0);

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
}