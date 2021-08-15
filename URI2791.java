/*
 */
package URIOnlineJudge;
import java.util.Scanner;

public class URI2791 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] feijao = new int[4];
        for (int i = 0; i < feijao.length; i++) {
            feijao[i] = scan.nextInt();
        }
        for (int i = 0; i < feijao.length; i++) {
            if (feijao[i] == 1)
                System.out.println(i + 1);
        }
    }
}


