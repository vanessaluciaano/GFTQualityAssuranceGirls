import java.util.Scanner;

/* Pede uma nota entre 0 e 10.
Mostra uma mensagem caso o valor seja inválido.
Continua pedindo até que seja informado um valor válido.
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10 ){
            System.out.println("Nota inválida! Digite novamente!");
            nota = scan.nextInt();
        }
    }
}
