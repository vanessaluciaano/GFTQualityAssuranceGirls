public class OperadoresLogicos {
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));
        System.out.println("b2 || b3: " + (b2 || b3));
        System.out.println("b3 || b4: " + (b3 || b4));
        System.out.println("b1 ^ b3: " + (b1 ^ b3));
        System.out.println("b4 ^ b1: " + (b4 ^ b1));
        System.out.println("!b1: " + (!b1));
        System.out.println("!b2: " + (!b2));
        System.out.println("(i1 > i2)||(f2<f1): " + ((i1 > i2)||(f2<f1)));
        System.out.println("((i1+i2)<(f2-f1))&& true: " + (((i1+i2)<(f2-f1))&& true));

        //Testa se tem direito a auxilio
        double salarioMensal = 11093.54;
        double mediaSalario = 10300.50;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo)&&(muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo)&&(muitosDependentes);
        System.out.println("Recebe Auxilio: " + recebeAuxilio);
    }
}
