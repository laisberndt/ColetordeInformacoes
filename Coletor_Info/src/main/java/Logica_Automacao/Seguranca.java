package Logica_Automacao;

public class Seguranca {
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
