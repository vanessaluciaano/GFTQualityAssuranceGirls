/*Lê 20 numeros inteiros aleatorios de 0-100
Armazena em um vetor
Mostra os numeros sucessores
 */
import java.util.Random;
public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatórios: ");
        for (int numero : numerosAleatorios
             ) {
            System.out.print(numero + " ");
        }

        System.out.println("\nNumeros Sucessores: ");
        for (int numero : numerosAleatorios
        ) {
            System.out.print((numero+1) + " ");
        }
    }
}
