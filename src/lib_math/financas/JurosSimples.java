package lib_math.financas;

public class JurosSimples {
    public static double calcularJurosSimples(double principal, double taxa, double tempo) {
        return principal * taxa * tempo;
    }

    public static double calcularMontanteJurosSimples(double principal, double taxa, double tempo) {
        return principal + calcularJurosSimples(principal, taxa, tempo);
    }
}
