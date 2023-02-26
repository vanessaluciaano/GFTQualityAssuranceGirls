import java.util.Scanner;

/* Ler um conjunto de dois valores, o primeiro representando o nome do aluno
e o segundo representando sua idade. O programa deve parar quando inserido o valor 0 no campo nome.
 */
public class Ex1_NomeIdade {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String nome;
            int idade;

            while(true){
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0")) break;

                System.out.println("Idade: ");
                idade = scan.nextInt();
            }

        }
}
