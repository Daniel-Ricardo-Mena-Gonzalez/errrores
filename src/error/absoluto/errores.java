
package error.absoluto;


public class errores {
    private double valorReal;
    private double valorAproximado;

    public errores(double valorReal, double valorAproximado) {
        this.valorReal = valorReal;
        this.valorAproximado = valorAproximado;
    }

    double ErrorAbsoluto() {
        double ErrorR = Math.abs(valorAproximado - valorReal);
        return ErrorR;
    }

    double ErrorRelativo() {
        double ErrorA = (ErrorAbsoluto()) / valorReal;
        return ErrorA;
    }

    double ErrorRelativoPorcentual() {
        double ErrorRP = (ErrorRelativo()) * 100;
        return ErrorRP;
    }
}
