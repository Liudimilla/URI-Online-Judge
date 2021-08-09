/* 1153 - Fatorial Simples ::Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.


 */
package URIOnlineJudge;
import java.util.Scanner;

public class URI1153 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num =  input.nextInt();
            int fatorial = 1;
            for (int i = num; i > 0; i--) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }
    }
