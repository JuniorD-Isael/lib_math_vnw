package lib_math.geometria;

public class CalculoPerimetro {

    private static final double PI = 3.14159; // Utilizando a aproximação de pi

    public static double calcularPerimetroRetangulo(double comprimento, double largura) {
        return 2 * (comprimento + largura);
    }

    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public static double calcularPerimetroCirculo(double raio) {
        return 2 * PI * raio;
    }
}
