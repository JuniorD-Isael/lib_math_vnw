package lib_math.financeiro;

public class Juros {

    public static double calcularJurosSimples(double principal, double taxa, double tempo) {
        return principal * taxa * tempo;
    }

    public static double calcularMontanteJurosSimples(double principal, double taxa, double tempo) {
        return principal + calcularJurosSimples(principal, taxa, tempo);
    }

    public static double calcularJurosCompostos(double principal, double taxa, int periodos, int vezesCapitalizacao) {
        return principal * Math.pow((1 + (taxa / vezesCapitalizacao)), vezesCapitalizacao * periodos) - principal;
    }

    public static double calcularMontanteJurosCompostos(double principal, double taxa, int periodos, int vezesCapitalizacao) {
        return principal + calcularJurosCompostos(principal, taxa, periodos, vezesCapitalizacao);
    }
}
