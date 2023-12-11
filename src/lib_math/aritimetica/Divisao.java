package lib_math.aritimetica;

public class Divisao {
    // Divisão Inteira
    public static <T extends Number> T dividir(T dividendo, T... divisores) {
        for (T divisor : divisores) {
            if (divisor.doubleValue() == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida");
            }
        }

        T resultado = dividendo;
        for (T divisor : divisores) {
            resultado = calcularDivisao(resultado, divisor);
        }
        return resultado;
    }

    private static <T extends Number> T calcularDivisao(T dividendo, T divisor) {
        if (dividendo instanceof Integer || dividendo instanceof Double) {
            double resultado = dividendo.doubleValue();
            double divisorValue = divisor.doubleValue();
            return (T) Double.valueOf(resultado / divisorValue);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }

    // Resto Divisão
    public static <T extends Number> T calcularResto(T dividendo, T... divisores) {
        for (T divisor : divisores) {
            if (divisor.doubleValue() == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida");
            }
        }

        T resto = dividendo;
        for (T divisor : divisores) {
            resto = calcularModulo(resto, divisor);
        }
        return resto;
    }

    private static <T extends Number> T calcularModulo(T dividendo, T divisor) {
        if (dividendo instanceof Integer || dividendo instanceof Double) {
            double resto = dividendo.doubleValue();
            double divisorValue = divisor.doubleValue();
            return (T) Double.valueOf(resto % divisorValue);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }
}
