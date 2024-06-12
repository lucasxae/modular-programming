package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Frequentador {

    // #region atributos
    /*
     * Lista do tipo Visita que armazena o registro de Visitas ao clube
     */
    private List<Visita> registroVisitas = new ArrayList<>();
    /*
     * Identificador de cada frequentador tanto socio quanto visitante
     */
    private String id;
    /*
     * Variavel que contem o nome de cada pessoa
     */
    private String nome;

    // #endregion
    // #region métodos
    private static class Visita {
        String nomePessoa;
        Date dataVisita;

        Visita(String nomePessoa, Date dataVisita) {
            this.nomePessoa = nomePessoa;
            this.dataVisita = dataVisita;
        }
    }

    /*
     * Metodo contrutor pra retornar o Id inserido
     */
    public String getID() {
        return this.id;
    }

    /*
     * Metodo contrutor pra retornar o nome inserido
     */
    public String getNome() {
        return this.nome;
    }

    /*
     * Metodo para registrar uma visita ao clube
     * 
     * @param nomePessoa deve ser inserido para o funcionamento
     * 
     * @return se o nome da pessoa e se ela foi registrada
     */
    public void registrarVisita(String nomePessoa) {
        Date dataVisita = new Date();
        Visita visita = new Visita(nomePessoa, dataVisita);
        registroVisitas.add(visita);
        System.out.println(nomePessoa + " registrou sua visita no clube em " + dataVisita);
    }

    /*
     * Metodo para registrar a saida de um visita ao clube
     * 
     * @param nomePessoa deve ser inserido para o funcionamento
     * 
     * @return se o nome da pessoa e se sua saida foi registrada
     */
    public void registrarSaida(String nomePessoa) {
        Date dataVisita = new Date();
        Visita visita = new Visita(nomePessoa, dataVisita);
        registroVisitas.add(visita);
        System.out.println(nomePessoa + " registrou sua Saida no clube em " + dataVisita);
    }

    /*
     * Metodo para verficar em alguma data especifica se a pessoa visitou o clube
     * 
     * @param data deve ser inserido para o funcionamento
     * 
     * @return um bool falando se ela esteve presente ou não em determinada data
     */
    public boolean visitouClubeEm(Data data) {
        for (Visita visita : registroVisitas) {
            if (visita.dataVisita.equals(data)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Metodo para criar o relatorio de visita de cada pessoa
     * 
     * 
     * @return uma tabela com a data e nome de quem visitou
     */
    public String relatorioVisitas() {
        StringBuilder relatorio = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        relatorio.append("Relatório de Visitas ao Clube\n");
        relatorio.append("---------------------------------\n");

        for (Visita visita : registroVisitas) {
            relatorio.append("Nome: ").append(visita.nomePessoa).append("\n");
            relatorio.append("Data da Visita: ").append(sdf.format(visita.dataVisita)).append("\n");
            relatorio.append("---------------------------------\n");
        }

        return relatorio.toString();
    }

}
