package entities;

import entities.date.Data;
import entities.date.Hora;

public class Visita {
  private Data data;
  private Hora horaDeEntrada;
  private Hora horaDeSaida;

  public Visita(Data data, Hora horaDeEntrada) {
    this.data = data;
    this.horaDeEntrada = horaDeEntrada;
    this.horaDeSaida = null;
  }

  public Data getData() {
    return this.data;
  }

  public Hora getHoraDeEntrada() {
    return this.horaDeEntrada;
  }

  public Hora getHoraDeSaida() {
    return this.horaDeSaida;
  }

  public void registrarSaida(Hora hora) {
    this.horaDeSaida = hora;
  }
}
