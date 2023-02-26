import java.util.Scanner;

/*Recebe N números inteiros
Calcula e mostra a quantidade de números pares
e quantidade de números impares.
 */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares =0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count = count + 1;
        } while (count < quantNumeros);

        System.out.println("Quantidade de numeros pares: " + quantPares);
        System.out.println("Quantidade de numeros impares: " + quantImpares);
    }
}
