// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.*;

public class DIO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          int morangos = input.nextInt();
          int macas = input.nextInt();
          double valorMorango = 0.0;
          double valorMaca = 0.0;

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
        if (morangos <= 5  && morangos >0)
            valorMorango = morangos * 2.50;
        else if (morangos >5)
            valorMorango = morangos * 2.20;

        if (macas <= 5  && macas >0)
            valorMaca = macas * 1.80;
        else if (morangos >5)
            valorMaca = macas * 1.50;

        if ( (morangos+macas >8) || (valorMaca+valorMorango>25.0) ){
            valorMorango = valorMorango * 0.9;
            valorMaca = valorMaca * 0.9;
        }
        System.out.println(valorMorango+valorMaca);


    }
}