package entities;

/**
 * A classe Clube representa um clube onde frequentadores podem se registrar,
 * registrar visitas e saídas, e gerar relatórios de atividades dos
 * frequentadores.
 */
public class clube {
    private Frequentador[] frequentadores; // Array de frequentadores
    private int quantFreq; // Quantidade atual de frequentadores no clube

    /**
     * Construtor da classe Clube.
     * 
     * @param n O número máximo de frequentadores permitidos no clube. Caso seja
     *          menor ou igual a 2, será definido como 2.
     */
    public clube(int n) {
        if (n <= 2)
            n = 2;
        frequentadores = new Frequentador[n];
        quantFreq = 0;
    }

    /**
     * Adiciona um novo frequentador ao clube, desde que haja espaço disponível e o
     * frequentador ainda não esteja registrado.
     * 
     * @param novo O novo frequentador a ser adicionado.
     * @return true se o frequentador foi adicionado com sucesso, false caso
     *         contrário.
     */
    public boolean addFrequentador(Frequentador novo) {
        boolean resposta = true;
        if (quantFreq == frequentadores.length)
            resposta = false;
        else {
            for (int i = 0; i < quantFreq && resposta; i++) {
                if (frequentadores[i].equals(novo))
                    resposta = false;
            }
            if (resposta) {
                frequentadores[quantFreq] = novo;
                quantFreq++;
            }
        }
        return resposta;
    }

    /**
     * Registra a visita de um frequentador ao clube com base em seu ID.
     * 
     * @param idFreq O ID do frequentador que está visitando o clube.
     */
    public void registrarVisita(String idFreq) {
        for (int i = 0; i < quantFreq; i++) {
            if (idFreq.equals(frequentadores[i].getID()))
                frequentadores[i].registrarVisita(idFreq);
        }
    }

    /**
     * Registra a saída de um frequentador do clube com base em seu ID.
     * 
     * @param idFreq O ID do frequentador que está saindo do clube.
     */
    public void registrarSaida(String idFreq) {
        for (int i = 0; i < quantFreq; i++) {
            if (idFreq.equals(frequentadores[i].getID()))
                frequentadores[i].registrarSaida(idFreq);
        }
    }

    /**
     * Gera um relatório das visitas dos frequentadores em uma data específica.
     * 
     * @param dia A data para a qual o relatório de visitas será gerado.
     * @return Uma string contendo o relatório das visitas na data especificada.
     */
    public String relatorioVisitasData(Data dia) {
        StringBuilder relat = new StringBuilder("Visitas em " + dia + "\n");
        for (int i = 0; i < quantFreq; i++) {
            if (frequentadores[i].visitouClubeEm(dia))
                relat.append(frequentadores[i] + "\n");
        }
        return relat.toString();
    }

    /**
     * Gera um relatório das visitas de um frequentador com base em seu ID.
     * 
     * @param idFreq O ID do frequentador para o qual o relatório será gerado.
     * @return Uma string contendo o relatório de visitas do frequentador ou uma
     *         mensagem de "Não existe este sócio" se o ID não corresponder a nenhum
     *         frequentador.
     */
    public String relatorioVisitasFreq(String idFreq) {
        for (int i = 0; i < quantFreq; i++) {
            if (idFreq.equals(frequentadores[i].getID()))
                return frequentadores[i].relatorioVisitas();
        }
        return "Não existe este sócio";
    }

    public void registrarVisita(String string, Data hoje, Data agora) {
    }
}
