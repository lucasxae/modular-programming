package test;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import entities.Data;
import entities.Socio;
import entities.clube;

public class testes {

  @Test
  void devePermitirAdicionarSocio() {
    clube clube = new clube(10);

    assertTrue(clube.addFrequentador(new Socio("1", "João")));
  }

  @Test
  void naoDevePermitirAdicionarSocioAcimaDoLimite() {
    clube clube = new clube(0);

    assertFalse(clube.addFrequentador(new Socio("1", "João")));
  }

  @Test
  void deveRegistrarVisitaDeSocio() {
    clube clube = new clube(10);
    Socio socio = new Socio("1", "João");
    Data hoje = new Data(1, 10, 2023);
    Data agora = new Data((byte) 12, (byte) 30, (byte) 0);

    clube.addFrequentador(socio);
    clube.registrarVisita("1", hoje, agora);

    assertTrue(socio.visitouClubeEm(hoje));
  }

  @Test
  void deveRegistrarVisitaDeConvidado() {
    clube clube = new clube(10);
    Socio socio = new Socio("1", "João");
    Convidado convidado = new Convidado("2", "Maria", socio);
    Data hoje = new Data(1, 10, 2023);
    Hora agora = new Hora((byte) 12, (byte) 30, (byte) 0);

    clube.addFrequentador(socio);
    clube.registrarVisita("2", hoje, agora);

    assertTrue(convidado.visitouClubeEm(hoje));
  }

  @Test
  void deveGerarRelatorioDeVisitasPorData() {
    clube clube = new clube(10);
    Socio socio = new Socio("1", "João");
    Convidado convidado = new Convidado("2", "Maria", socio);
    Data hoje = new Data(1, 10, 2023);
    Hora agora = new Hora((byte) 12, (byte) 30, (byte) 0);

    clube.addFrequentador(socio);
    clube.registrarVisita("1", hoje, agora);
    clube.registrarVisita("2", hoje, agora);

    assertEquals("Relatório do dia 01/10/2023\n - João\n - Maria", clube.relatorioVisitaData(hoje));
  }

  @Test
  void deveGerarRelatorioDeVisitasPorUsuario() {
    Clube clube = new Clube(10);
    Socio socio = new Socio("1", "João");
    Convidado convidado = new Convidado("2", "Maria", socio);
    Data hoje = new Data(1, 10, 2023);
    Hora agora = new Hora((byte) 12, (byte) 30, (byte) 0);
    Data amanha = new Data(2, 10, 2023);

    clube.addFrequentador(socio);
    clube.registrarVisita("1", hoje, agora);
    clube.registrarVisita("2", hoje, agora);
    clube.registrarVisita("1", amanha, agora);

    assertEquals("Relatório do usuario 1\n" + hoje.dataFormatada() + "\n" + amanha.dataFormatada(),
        clube.relatorioVisitasFreq("1"));
  }

}
