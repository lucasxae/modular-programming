package entities.testes;

import entities.Clube;
import entities.date.*;
import entities.Frequentador;
import entities.Socio;
import entities.Convidado;
import entities.Visita;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClubeTest {

  @Test
  void devePermitirAdicionarSocio() {
    Clube clube = new Clube(10);

    assertTrue(clube.addFrequentador(new Socio("1", "João")));
  }

  @Test
  void naoDevePermitirAdicionarSocioAcimaDoLimite() {
    Clube clube = new Clube(0);

    assertFalse(clube.addFrequentador(new Socio("1", "João")));
  }

  @Test
  void deveRegistrarVisitaDeSocio() {
    Clube clube = new Clube(10);
    Socio socio = new Socio("1", "João");
    Data hoje = new Data(1, 10, 2023);
    Hora agora = new Hora((byte) 12, (byte) 30, (byte) 0);

    clube.addFrequentador(socio);
    clube.registrarVisita("1", hoje, agora);

    assertTrue(socio.visitouClubeEm(hoje));
  }

  @Test
  void deveRegistrarVisitaDeConvidado() {
    Clube clube = new Clube(10);
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
    Clube clube = new Clube(10);
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
