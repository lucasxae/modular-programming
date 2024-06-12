package entities;

import java.util.ArrayList;

import entities.date.Data;
import entities.date.Hora;

public class Clube {
  private ArrayList<Socio> frequentadores;
  private int qtdFrequentadores;

  public Clube(int qtd) {
    this.frequentadores = new ArrayList<Socio>();
    this.qtdFrequentadores = qtd;
  }

  public boolean addFrequentador(Socio frequentador) {
    if (frequentadores.size() >= qtdFrequentadores) {
      return false;
    }

    frequentadores.add(frequentador);

    return true;
  }

  public void registrarVisita(String id, Data data, Hora horaDeEntrada) {
    Socio f = null;
    Convidado c = null;

    for (Socio frequentador : frequentadores) {
      if (frequentador.getId().equals(id)) {
        f = frequentador;
        break;
      }

      for (Convidado convidado : frequentador.getConvidados()) {
        if (convidado.getId().equals(id)) {
          c = convidado;
          break;
        }
      }
    }

    if (f == null) {
      c.registrarVisita(data, horaDeEntrada);
      return;
    }

    f.registrarVisita(data, horaDeEntrada);
  }

  public void registrarSaida(String id, Hora hora) {
    for (Frequentador frequentador : frequentadores) {
      if (frequentador.getId().equals(id)) {
        frequentador.registrarSaida(hora);
        break;
      }
    }
  }

  public String relatorioVisitaData(Data data) {
    StringBuilder relat = new StringBuilder("Relatório do dia " + data.dataFormatada());
    for (Socio frequentador : frequentadores) {
      for (Visita vis : frequentador.getVisitas()) {
        if (vis.getData().dataFormatada().equals(data.dataFormatada())) {
          relat.append("\n - " + frequentador.getNome());
        }
        for (Convidado convidado : frequentador.getConvidados()) {
          for (Visita vis2 : convidado.getVisitas()) {
            if (vis2.getData().dataFormatada().equals(data.dataFormatada())) {
              relat.append("\n - " + convidado.getNome());
            }
          }
        }
      }
    }
    return relat.toString();
  }

  public String relatorioVisitasFreq(String id) {
    StringBuilder relat = new StringBuilder("Relatório do usuario " + id);
    for (Socio frequentador : frequentadores) {
      if (frequentador.getId().equals(id)) {
        for (Visita vis : frequentador.getVisitas()) {
          relat.append("\n" + vis.getData().dataFormatada());
        }
      }

      for (Convidado convidado : frequentador.getConvidados()) {
        for (Visita vis : convidado.getVisitas()) {
          relat.append("\n" + vis.getData().dataFormatada());
        }
      }
    }

    return relat.toString();
  }
}