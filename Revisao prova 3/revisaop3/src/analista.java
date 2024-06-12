public class analista implements ICLT {

    private Double horasExtras;
    private EAnalista tipoAnalista;
    private ICLT calc;
    private IImposto calcImposto;

    public double calcValorHorasExtras() {
        double valorHorasExtras = 0.0;
        valorHorasExtras = this.horasExtras + (this.horasExtras / 0.0111);
        return valorHorasExtras;
    };

    public double calcSalFinal() {
        double salarioFinal = 0.0;
        double salarioCImpost = this.calcImposto.calcularImpostoDeRenda(this.tipoAnalista.getSalarioBase());
        salarioFinal = salarioCImpost + this.calcValorHorasExtras();
        return salarioFinal;
    };

    public double addHorasExtras() {
        double horasExtras = 0.0;
        horasExtras = this.horasExtras + 1;
        return horasExtras;
    }

    public double salarioAnual() {
        double salarioAnual = 0.0;
        salarioAnual = calcSalFinal() * 12;
        return salarioAnual;
    }

    @Override
    public double calcularFerias(double salarioBase) {
        return salarioBase * 1.33;
    }

    @Override
    public double calcularDecimoTerceiro(double salarioBase) {
        return salarioBase;
    }

    public Double getHorasExtras() {
        return this.horasExtras;
    }

    public void setHorasExtras(Double horasExtras) {
        this.horasExtras = horasExtras;
    }
    public EAnalista getTipoAnalista() {
        return this.tipoAnalista;
    }

    public void setAnalista(EAnalista tipoAnalista) {
        this.tipoAnalista = tipoAnalista;
    }
}
