package entities;

import java.util.ArrayList;

import entities.date.Data;
import entities.date.Hora;

public class Frequentador {
  private String id;
  private String nome;
  private ArrayList<Visita> visitas;

  public Frequentador(String id, String nome) {
    this.id = id;
    this.nome = nome;
    this.visitas = new ArrayList<Visita>();
  }

  public String getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public ArrayList<Visita> getVisitas() {
    return this.visitas;
  }

  public boolean visitouClubeEm(Data data) {
    for (Visita vis : this.visitas) {
      if (vis.getData().dataFormatada().equals(data.dataFormatada())) {
        return true;
      }
    }

    return false;
  }

  public void registrarVisita(Data data, Hora horaDeEntrada) {
    this.visitas.add(new Visita(data, horaDeEntrada));
  }

  public void registrarSaida(Hora hora) {
    Visita ultimaVisita = this.visitas.get(this.visitas.size() - 1);
    ultimaVisita.registrarSaida(hora);
  }
}
