package main.java.com.vnw.lib_math.core.aritimetica.numeros;

public class Multiplicacao {
    public static float multiplicar(float... valores) {
        float produto = valores[0];
        for(int i = 1 ; i < valores.length; i++){
            produto *= valores[i];
        }
        return produto;
    }

    public static int multiplicar(int... valores) {
        int produto = valores[0];
        for(int i = 1 ; i < valores.length; i++){
            produto *= valores[i];
        }
        return produto;
    }
     public static double multiplicar(double... valores) {
        double produto = valores[0];
        for(int i = 1 ; i < valores.length; i++){
            produto *= valores[i];
        }
        return produto;
     }
}
