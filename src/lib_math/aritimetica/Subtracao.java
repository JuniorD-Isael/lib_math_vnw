package lib_math.aritimetica;

public class Subtracao {
    public static <T extends Number> T subtrair(T valor0, T... valores) {
        double diferenca = valor0.doubleValue();
        for (T valor : valores) {
            diferenca -= valor.doubleValue();
        }

        if (valor0 instanceof Integer){
            return (T) Integer.valueOf((int) diferenca);
        } else if (valor0 instanceof Double){
            return (T) Double.valueOf(diferenca);
        } else {
            throw new IllegalArgumentException("Tipos de dados não suportados");
        }
    }
}
