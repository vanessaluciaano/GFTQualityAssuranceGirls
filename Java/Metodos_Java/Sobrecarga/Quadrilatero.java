//calcula a area de um quadrilatero
public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Area do quadrado: " + lado*lado );
    }
    public static void area(double lado1, double lado2) {
        System.out.println("Area do retângulo: " + lado1*lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }
    public static void area(float diagonal, float diagonal2) {
        System.out.println("Area do losango: " + (diagonal+diagonal2)/2);
    }
}
