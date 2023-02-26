//Cria um vetor de 6 números interios e exibe em ordem inversa
public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, 2, 4, 6, 10, 88};

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor inverso: ");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }

    }
}
