package lib_math.aritimetica;

public class Multiplicacao {
    public static <T extends Number> T multiplicar(T valor0, T... valores) {
        double produto = valor0.doubleValue();
        for (T valor : valores) {
            produto *= valor.doubleValue();
        }
        if (valor0 instanceof Integer) {
            return (T) Integer.valueOf((int) produto);
        } else if (valor0 instanceof Double) {
            return (T) Double.valueOf(produto);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }
}
