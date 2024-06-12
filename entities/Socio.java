package entities;

import java.util.ArrayList;

import entities.date.Data;
import entities.date.Hora;

public class Socio extends Frequentador {

  private ArrayList<Convidado> convidados;

  public Socio(String id, String nome) {
    super(id, nome);
    this.convidados = new ArrayList<Convidado>();
  }

  public void emitirConvite(Convidado convidado) {
    if (convidados.size() >= 4) {
      return;
    }
    convidados.add(convidado);
  }

  public ArrayList<Convidado> getConvidados() {
    return this.convidados;
  }

  public void registrarVisita(String id, Data data, Hora horaDeEntrada) {
    super.registrarVisita(data, horaDeEntrada);
  }

}
