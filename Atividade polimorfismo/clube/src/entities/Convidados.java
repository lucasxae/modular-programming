package entities;

/**
 * Classe para representação do convidado que é um frequentador de um clube.
 *
 * Esta classe estende a classe `Frequentador` e adiciona métodos específicos
 * para convidados,
 * como obter informações sobre uma visita, registrar visita e gerar relatório
 * de visitas.
 */
public class Convidados extends Frequentador {

    /**
     * Registra a visita de um convidado ao clube.
     *
     * @param nome O nome do convidado que está registrando a visita.
     */
    public void registrarVisita(String nome) {
        registrarVisita(nome);
    }

    /**
     * Gera um relatório das visitas do convidado ao clube.
     *
     * @return Uma string contendo o relatório das visitas do convidado.
     */
    public String relatorio() {
        return relatorioVisitas();
    }
}
