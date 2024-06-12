# Projetos

Projetos realizados no 2° periodo do curso de Engenharia de Software nas aulas de Programação Modular

## Assuntos Abordados

- Polimorfismo
- SOLID
- Testes Unitários
- Padrões de Projeto
- Tratamento de Excessões
- Uso de Fabricas e outros padrões

## Atividades

- Atividade de Polimorfismo
  ```
  Atividade sobre gestão de um Clube e seus visitantes. O diagrama a seguir representa as relações e comportamento de cada classe, assim, ajudando no desenvolvimento:
  ```
  ![Diagram](./Atividade%20polimorfismo/Diagrama/Captura%20de%20tela%202023-10-02%20100203.png)

- Desafio Java
  ```
  Algumas atividades para auxilar no desenvolvimento das skills no Java e para treinar a lógica de programação
  ```

- POO Básica
  ```
  Atividades com conceitos de Programação Orientada a Objeto
  ```

- Projeto Esportivo
  ```
  Atividades com conceitos de Programação Orientada a Objeto
  ```

- Projeto Estacionamento
  ```
  Atividades com conceitos de Programação Orientada a Objeto
  ```

- Revisão da Prova Final
  ```
  Atividades com conceitos de Programação Orientada a Objeto
  ```



## Directory Hierarchy

```
|—— Atividade polimorfismo
|    |—— clube
|        |—— bin
|            |—— entities
|                |—— clube.class
|                |—— Convidados.class
|                |—— Data.class
|                |—— Frequentador$Visita.class
|                |—— Frequentador.class
|                |—— Socio.class
|                |—— Visita.class
|            |—— test
|                |—— testes.class
|        |—— lib
|        |—— README.md
|        |—— src
|            |—— entities
|                |—— clube.java
|                |—— Convidados.java
|                |—— Data.java
|                |—— Frequentador.java
|                |—— Socio.java
|                |—— Visita.java
|            |—— test
|                |—— testes.java
|    |—— Diagrama
|        |—— Captura de tela 2023-10-02 100203.png
|    |—— questao 1.drawio
|—— desafiojava-lucasxae
|    |—— .gitignore
|    |—— codigo
|        |—— desafio02
|            |—— aplicado08.java
|            |—— aplicado09.java
|            |—— data.java
|        |—— desafio03
|            |—— Data.java
|            |—— documentacao.md
|        |—— LerFraseMostrarInverso.java
|        |—— LerVetorSomarCasas.java
|        |—— README.md
|    |—— docs
|        |—— diagramas
|            |—— README.md
|        |—— instrucoes.md
|        |—— README.md
|    |—— LICENSE
|    |—— README.md
|—— entities
|    |—— Clube.java
|    |—— Convidado.java
|    |—— date
|        |—— Data.java
|        |—— Hora.java
|    |—— Frequentador.java
|    |—— Main.java
|    |—— Socio.java
|    |—— testes
|        |—— Teste.java
|    |—— Visita.java
|—— POO BASICA
|    |—— atividade.drawio
|    |—— clases.drawio
|    |—— poo
|        |—— Captura de tela 2023-09-02 084559.png
|        |—— Captura de tela 2023-09-02 084610.png
|        |—— Captura de tela 2023-09-02 084620.png
|        |—— Partida.java
|    |—— Poo basica
|        |—— lib
|        |—— README.md
|        |—— src
|            |—— Partida.java
|    |—— poo.zip
|    |—— questao 1.drawio
|—— Projeto 2
|    |—— projeto2-g7
|        |—— .gitignore
|        |—— .idea
|            |—— misc.xml
|            |—— workspace.xml
|        |—— bin
|            |—— entities
|        |—— codigo
|            |—— main
|                |—— aplication
|                    |—— app.java
|                |—— entities
|                    |—— Campeonato.java
|                    |—— Data.java
|                    |—— Equipe.java
|                    |—— EquipeArquivo.java
|                    |—— IPartida.java
|                    |—— PartidaArquivo.java
|                    |—— PartidaBasquete.java
|                    |—— PartidaFutebol.java
|            |—— README.md
|            |—— teste
|                |—— appTest.java
|                |—— CampeonatoTest.java
|                |—— EquipeTest.java
|                |—— PartidaTest.java
|        |—— docs
|            |—— diagramas
|                |—— README.md
|            |—— instrucoes.md
|            |—— README.md
|        |—— equipes.arq
|        |—— equipes.txt
|        |—— lib
|            |—— hamcrest-core-1.3.jar
|            |—— junit-4.13.2.jar
|        |—— LICENSE
|        |—— partidas.arq
|        |—— README.md
|—— Projeto5
|    |—— .idea
|        |—— .gitignore
|        |—— libraries
|            |—— junit_platform_console_standalone_1_10_1.xml
|        |—— misc.xml
|        |—— modules.xml
|        |—— Projeto5.iml
|        |—— vcs.xml
|        |—— workspace.xml
|    |—— lib
|        |—— junit-platform-console-standalone-1.10.1.jar
|    |—— projeto3-g7
|        |—— .gitignore
|        |—— codigo
|            |—— codigo
|                |—— application
|                    |—— Main.java
|                |—— entities
|                    |—— entities
|                        |—— Cliente.java
|                        |—— DAO
|                            |—— DAO.java
|                            |—— DAOCliente.java
|                            |—— DAOVeiculo.java
|                        |—— Data.java
|                        |—— Enums
|                            |—— ECliente.java
|                            |—— ETurnos.java
|                            |—— Servicos.java
|                        |—— Estacionamento.java
|                        |—— excecoes
|                            |—— ClienteDuplicadoException.java
|                            |—— ClienteNaoEncontradoException.java
|                            |—— VeiculoDuplicadoException.java
|                            |—— VeiculoJaEstacionadoException.java
|                            |—— VeiculoNaoEncontradoException.java
|                        |—— Fabricas
|                            |—— FabricaUsoDeTurno.java
|                            |—— FabricaUsoDeVagaHorista.java
|                            |—— FabricaUsoDeVagaMensalista.java
|                        |—— IDataToText.java
|                        |—— interfaces
|                            |—— IFabrica.java
|                        |—— UsoDeVaga.java
|                        |—— UsoHorista.java
|                        |—— UsoMensalista.java
|                        |—— UsoTurno.java
|                        |—— Vaga.java
|                        |—— Veiculo.java
|                |—— README.md
|            |—— README.md
|            |—— test
|                |—— TestCliente.java
|                |—— TestEstacionamento.java
|                |—— TestUsoDeVaga.java
|                |—— TestVaga.java
|                |—— TestVeiculo.java
|        |—— docs
|            |—— diagramas
|                |—— README.md
|            |—— instrucoes.md
|            |—— README.md
|        |—— LICENSE
|        |—— README.md
|—— Revisao prova 3
|    |—— .idea
|        |—— .gitignore
|        |—— misc.xml
|        |—— modules.xml
|        |—— workspace.xml
|    |—— out
|        |—— production
|            |—— Revisao prova 3
|                |—— App.class
|    |—— q5.drawio
|    |—— Revisao prova 3.iml
|    |—— revisaop3
|        |—— bin
|            |—— analista.class
|            |—— App.class
|            |—— EAnalista.class
|            |—— ETipoFuncionario.class
|            |—— funcionario.class
|            |—— ICLT.class
|            |—— IImposto.class
|            |—— Imposto.class
|        |—— lib
|        |—— README.md
|        |—— src
|            |—— analista.java
|            |—— App.java
|            |—— EAnalista.java
|            |—— ETipoFuncionario.java
|            |—— funcionario.java
|            |—— ICLT.java
|            |—— IImposto.java
|            |—— Imposto.java
|—— revisao3.drawio
```

## Detalhes de Desenvolvimento



- software
  ```
  Desenvolvido em Java
  Diagramas feitos no Draw.io
  ```



## License
Lucas Chaves
