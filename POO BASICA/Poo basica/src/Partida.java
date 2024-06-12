public class Partida {
    private String equipe1Nome;
    private int[] equipe1Pontuacao;
    private String equipe2Nome;
    private int[] equipe2Pontuacao;

    public Partida(String equipe1Nome, int[] equipe1Pontuacao, String equipe2Nome, int[] equipe2Pontuacao) {
        this.equipe1Nome = equipe1Nome;
        this.equipe1Pontuacao = equipe1Pontuacao;
        this.equipe2Nome = equipe2Nome;
        this.equipe2Pontuacao = equipe2Pontuacao;
    }

    public String calcularVencedor() {
        int pontuacaoEquipe1 = calcularPontuacaoTotal(equipe1Pontuacao);
        int pontuacaoEquipe2 = calcularPontuacaoTotal(equipe2Pontuacao);

        if (pontuacaoEquipe1 > pontuacaoEquipe2) {
            return equipe1Nome;
        } else if (pontuacaoEquipe2 > pontuacaoEquipe1) {
            return equipe2Nome;
        } else {
            return "Empate";
        }
    }

    private int calcularPontuacaoTotal(int[] pontuacao) {
        int total = 0;
        for (int valor : pontuacao) {
            total += valor;
        }
        return total;
    }

    public void imprimirPlacar() {
        System.out.println("1Q 2Q 3Q 4Q PR FINAL");
        System.out.println(equipe1Nome + " " + formatarPontuacao(equipe1Pontuacao) + " -- " + calcularPontuacaoTotal(equipe1Pontuacao));
        System.out.println(equipe2Nome + " " + formatarPontuacao(equipe2Pontuacao) + " -- " + calcularPontuacaoTotal(equipe2Pontuacao));
    }

    private String formatarPontuacao(int[] pontuacao) {
        StringBuilder resultado = new StringBuilder();
        for (int valor : pontuacao) {
            resultado.append(valor).append(" ");
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String equipe1Nome = "EQUIPE1";
        int[] equipe1Pontuacao = {21, 19, 23, 24};
        String equipe2Nome = "EQUIPE2";
        int[] equipe2Pontuacao = {32, 25, 20, 20};

        Partida partida = new Partida(equipe1Nome, equipe1Pontuacao, equipe2Nome, equipe2Pontuacao);
        String vencedor = partida.calcularVencedor();
        partida.imprimirPlacar();

        System.out.println("Equipe vencedora: " + vencedor);
    }
}
