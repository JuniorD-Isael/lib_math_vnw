package main.java.com.vnw.lib_math.core.aritimetica.numeros;

public class Potenciacao {
    public static <T extends Number> double potencia(T base, int... expoentes) {
        double resultado = base.doubleValue();
        for (int expoente : expoentes) {
            resultado = potenciaPositiva(resultado, expoente);
        }
        return resultado;
    }

    private static double potenciaPositiva(double base, int expoente) {
        if (expoente < 0) {
            throw new IllegalArgumentException("Expoente negativo não é suportado nesta implementação");
        }

        double resultado = 1.0;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
