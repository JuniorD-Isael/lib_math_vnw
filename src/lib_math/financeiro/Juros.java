package lib_math.financeiro;

import lib_math.aritimetica.Potenciacao;

import static lib_math.aritimetica.Potenciacao.potencia;

public class Juros {

    public static double calcularJurosSimples(double principal, double taxa, double tempo) {
        return principal * taxa * tempo;
    }

    public static double calcularMontanteJurosSimples(double principal, double taxa, double tempo) {
        return principal + calcularJurosSimples(principal, taxa, tempo);
    }

    public static double calcularJurosCompostos(double principal, double taxa, int periodos, int vezesCapitalizacao) {

        return principal * potencia((1 + (taxa / vezesCapitalizacao)), vezesCapitalizacao * periodos) - principal;
    }

    public static double calcularMontanteJurosCompostos(double principal, double taxa, int periodos, int vezesCapitalizacao) {
        return principal + calcularJurosCompostos(principal, taxa, periodos, vezesCapitalizacao);
    }
}
