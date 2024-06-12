package entities;

import entities.date.Data;
import entities.date.Hora;

public class Convidado extends Frequentador {

  Socio socio;

  public Convidado(String id, String nome, Socio socio) {
    super(id, nome);
    this.socio = socio;
  }

  @Override
  public void registrarVisita(Data data, Hora horaDeEntrada) {
    Visita ultimaVisita = socio.getVisitas().get(socio.getVisitas().size() - 1);
    if (ultimaVisita.getHoraDeSaida() == null) {
      super.registrarVisita(data, horaDeEntrada);
    }
  }

}
