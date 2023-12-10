package main.java.com.vnw.lib_math.core.financas;


public class JurosCompostos {
    public static double calcularJurosCompostos(double principal, double taxa, int periodos, int vezesCapitalizacao) {
        return principal * Math.pow((1 + (taxa / vezesCapitalizacao)), vezesCapitalizacao * periodos) - principal;
    }

    public static double calcularMontanteJurosCompostos(double principal, double taxa, int periodos, int vezesCapitalizacao) {
        return principal + calcularJurosCompostos(principal, taxa, periodos, vezesCapitalizacao);
    }
}
