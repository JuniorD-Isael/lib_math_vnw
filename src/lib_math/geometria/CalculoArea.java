package lib_math.geometria;

public class CalculoArea {
    private static final double PI = 3.14159;
    public static double calcularAreaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double raio) {
        return PI * raio * raio;
    }
}
