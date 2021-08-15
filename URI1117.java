/* 1117 - Validação de Nota.:: Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
        Entrada
        A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

        Saída
        Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
        Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.
*/
package URIOnlineJudge;
import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        float ava = 0 , media = 0;
        float nota = 0, av1;
        Scanner x = new Scanner(System.in);

        while (ava != 2) {
            av1 = x.nextFloat();
            if (av1 >= 0.0 && av1 <= 10.0) {
                nota += av1;
                ava += 1;
            } else {
                System.out.print("nota invalida\n");
            }
        }
        media = nota / 2;
        System.out.printf("media = %.2f\n",media);
    }
}






