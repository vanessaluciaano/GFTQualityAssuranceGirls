/* Gera a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número da Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++ ){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
