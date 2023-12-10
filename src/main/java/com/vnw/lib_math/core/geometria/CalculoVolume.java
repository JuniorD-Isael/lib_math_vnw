package main.java.com.vnw.lib_math.core.geometria;

public class CalculoVolume {
    private static final double PI = 3.14159;

    public static double calcularVolumeCubo(double aresta) {
        return aresta * aresta * aresta;
    }

    public static double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * PI * raio * raio * raio;
    }

    public static double calcularVolumeCilindro(double raio, double altura) {
        return PI * raio * raio * altura;
    }

    public static double calcularVolumePrismaRetangular(double comprimento, double largura, double altura) {
        return comprimento * largura * altura;
    }
}
