package main.java.com.vnw.lib_math.core.aritimetica.numeros;

public class Soma {
    public static float somar(float... valores ){
        float resultado = 0;
        for(float valor : valores){
            resultado += valor;
        }
        return resultado;
    }

    public static int somar(int... valores){
        int resultado = 0;
        for(int valor : valores){
            resultado += valor;
        }
        return resultado;
    }
     public static double somar(double... valores) {
        double resultado = 0;
        for(double valor : valores){
            resultado += valor;
        }
        return resultado;
     }
}
