/* URI 1080 Maior e Posição::Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.
Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */
package URIOnlineJudge;

import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);
        int mai = 0, pos = 0;

        for (int i = 1; i <= 100; i++) {
            int num =  milla.nextInt();
            if (mai > num) {
                mai = mai;
                pos = pos;
            } else {
                pos = i;
                mai = num;
            }
        }
        System.out.print(mai + "\n" + pos + "\n");
    }
}
