// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DIO_IR {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0.0;
        DecimalFormat df = new DecimalFormat("#,###.00");

        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
        if (renda <= 2000.00)
            System.out.println("Isento");
        else{
            if (renda <=3000.00)
                imposto = (renda-2000) * 0.08;
            else if (renda <=4500.00)   // 8% em mil reais + 18% em cima do que passar de 3 mil reais
                imposto = ( (1000.00 * 0.08) + (renda - 3000.00) * 0.18) ;
            else if( renda > 4500.00)      // 8% em mil reais + 18% em cima de mil e quinhentos + 28%  em cima do restante
                imposto = ( (1000.00 * 0.08) + (1500.00 * 0.18) +  (renda - 4500.00) * 0.28) ;

            System.out.println("R$ "+df.format(imposto));
        }



    }

}