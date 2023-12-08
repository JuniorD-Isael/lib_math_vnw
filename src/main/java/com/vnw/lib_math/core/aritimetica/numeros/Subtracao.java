package main.java.com.vnw.lib_math.core.aritimetica.numeros;

public class Subtracao {
    public static double subtrair(double... valores) {
        double resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }
        return resultado;
    }

    public static float subtrair(float... valores) {
        float resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }
        return resultado;
    }

    public static int subtrair(int... valores) {
        int resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }
        return resultado;
    }
}

