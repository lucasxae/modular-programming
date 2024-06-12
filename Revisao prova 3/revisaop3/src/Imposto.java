public class Imposto implements IImposto {
           private static final Double FAIXA_SALARIAL = 1903.98;
    private static final Double ALIQUOTA = 0.075;

    @Override
    public Double calcularImpostoDeRenda(Double salarioBase) {
        if (salarioBase <= FAIXA_SALARIAL) {
            return 0.0;
        } else {
            return (salarioBase - FAIXA_SALARIAL) * ALIQUOTA;
        }
    }
} 
