package lib_math.aritimetica;

public class DivisaoInteira {
    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }

    public static double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }

    public static <T extends Number> T dividir(T dividendo, T... divisores) {
        T resultado = dividendo;
        for (T divisor : divisores) {
            if (divisor instanceof Integer) {
                resultado = (T) Integer.valueOf(resultado.intValue() / divisor.intValue());
            } else if (divisor instanceof Double) {
                resultado = (T) Double.valueOf(resultado.doubleValue() / divisor.doubleValue());
            } else {
                throw new IllegalArgumentException("Tipos de dados não suportados");
            }
        }
        return resultado;
    }
}
