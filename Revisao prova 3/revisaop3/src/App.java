public class App {
    public static void main(String[] args) {
        // Cria um objeto Analista
        analista analista = new analista();
        funcionario funcionario = new funcionario();

        // Define as horas extras
        analista.setHorasExtras(10.0);

        // Define o tipo de analista
        analista.setAnalista(EAnalista.SENIOR);

        // Calcula o valor das horas extras
        double valorHorasExtras = analista.calcValorHorasExtras();
        System.out.println("Valor das Horas Extras: " + valorHorasExtras);

        // Calcula o salário final
        double salarioFinal = analista.calcSalFinal();
        System.out.println("Salário Final: " + salarioFinal);

        // Adiciona horas extras
        double novasHorasExtras = analista.addHorasExtras();
        System.out.println("Novas Horas Extras: " + novasHorasExtras);

        // Calcula as férias
        double ferias = analista.calcularFerias(analista.getTipoAnalista().getSalarioBase());
        System.out.println("Férias: " + ferias);

        // Calcula o décimo terceiro
        double decimoTerceiro = analista.calcularDecimoTerceiro(analista.getTipoAnalista().getSalarioBase());
        System.out.println("Décimo Terceiro: " + decimoTerceiro);

        // Calcula o salário anual
        double salarioAnual = analista.salarioAnual();
        System.out.println("Salário Anual: " + salarioAnual);
    }
}
