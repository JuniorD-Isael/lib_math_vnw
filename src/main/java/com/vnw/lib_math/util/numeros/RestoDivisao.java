package main.java.com.vnw.lib_math.util.numeros;

public class RestoDivisao {
    public static int calcularResto(int dividendo, int divisor) {
        return dividendo % divisor;
    }

    public static double calcularResto(double dividendo, double divisor) {
        return dividendo % divisor;
    }

    public static <T extends Number> T calcularResto(T dividendo, T... divisores) {
        T resto = dividendo;
        for (T divisor : divisores) {
            if (divisor instanceof Integer) {
                resto = (T) Integer.valueOf(resto.intValue() % divisor.intValue());
            } else if (divisor instanceof Double) {
                resto = (T) Double.valueOf(resto.doubleValue() % divisor.doubleValue());
            } else {
                throw new IllegalArgumentException("Tipos de dados não suportados");
            }
        }
        return resto;
    }
}
