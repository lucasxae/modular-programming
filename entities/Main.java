package entities;

import entities.date.Data;
import entities.date.Hora;

public class Main {
  public static void main(String[] args) {
    Data hoje = new Data(2, 10, 2023);
    Hora agora = new Hora((byte) 12, (byte) 30, (byte) 0);
    Clube clube = new Clube(4);

    Socio socio = new Socio("123", "João");
    Convidado convidado = new Convidado("456", "Maria", socio);
    socio.emitirConvite(convidado);

    clube.addFrequentador(socio);
    clube.registrarVisita(socio.getId(), hoje, agora);
    clube.registrarVisita(convidado.getId(), hoje, agora);

    System.out.println(clube.relatorioVisitasFreq(convidado.getId()));
    System.out.println(clube.relatorioVisitaData(hoje));
  }
}
