package entities;

/**
 * Representa um sócio que é um frequentador de um clube.
 *
 * Esta classe estende a classe `Frequentador` e adiciona métodos específicos
 * para sócios,
 * como registrar saída, registrar visita e gerar relatório de visitas.
 */
public class Socio extends Frequentador {

    /**
     * Registra a saída de um sócio do clube.
     *
     * @param nome O nome do sócio que está registrando a saída.
     */
    public void registrarSaida(String nome) {
        registrarSaida(nome);
    }

    /**
     * Registra a visita de um sócio ao clube em uma data específica.
     *
     * @param data A data em que o sócio visitou o clube.
     */
    public void visitouClube(Data data) {
        visitouClubeEm(data);
    }

    /**
     * Gera um relatório das visitas do sócio ao clube.
     *
     * @return Uma string contendo o relatório das visitas do sócio.
     */
    public String relatorio() {
        return relatorioVisitas();
    }
}
