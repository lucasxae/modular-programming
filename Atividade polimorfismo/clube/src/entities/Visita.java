package entities;

import java.util.Date;

public class Visita {

    // #region atributos
    /*
     * variavel do tipo Frequentador, possibilitando o acesso de ambas
     */
    private Frequentador frequentador;
    /*
     * variavel do tipo data
     */
    private Date data;
    /*
     * variavel do tipo data para retorno da hora de entrada
     */
    private Date horaEntrada;
    /*
     * variavel do tipo data para retorno da hora de saida
     */
    private Date horaSaida;
    /*
     * variavel do tipo String para o nome do visitante
     */
    String nomePessoa;
    /*
     * variavel do tipo data para a data especifica da visita dele
     */
    Date dataVisita;

    // #endregion
    // #region contrutores
    public Visita(Frequentador frequentador, Date data) {
        this.frequentador = frequentador;
        this.data = data;
    }

    public Frequentador getFrequentador() {
        return frequentador;
    }

    public Date getData() {
        return data;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    // #region métodos
    /*
     * Metodo para registrar visita
     * 
     * @return a data que a visita foi feita ao clube
     */
    public void registrarVisita(Data data) {
        this.horaEntrada = new Date();
    }
    // #endregion
}
