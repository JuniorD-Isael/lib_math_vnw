package lib_math.aritimetica;

public class Soma {
    public static <T extends Number> T somar(T valor0, T... valores) {
        double resultado = valor0.doubleValue();
        for (T valor : valores) {
            resultado += valor.doubleValue();
        }
        if (valor0 instanceof Integer) {
            return (T) Integer.valueOf((int) resultado);
        } else if (valor0 instanceof Double) {
            return (T) Double.valueOf(resultado);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }
}
