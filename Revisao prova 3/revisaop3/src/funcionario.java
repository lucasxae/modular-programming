import java.time.LocalDateTime;

public class funcionario {
    private String nome;
    private String cpf;
    private Double salarioBase;
    private LocalDateTime dataAdmissao;
    private ETipoFuncionario tipoFuncionario;

    String descricao;
    analista analista;

    public double calcSalFinal() {

        ETipoFuncionario.getTipoFuncionario(descricao);

        switch (tipoFuncionario.getDescricao()) {
            case "Analista":
                analista.calcSalFinal();
                break;
            case "Gerente":
                // gerente.calcSalFinal();
                break;
            case "Diretor":
                // diretor.calcSalFinal();
                break;
            default:
                break;
        }
        return 0.0;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDateTime getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public ETipoFuncionario getTipoFuncionario() {
        return this.tipoFuncionario;
    }

    public void setTipoFuncionario(ETipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public analista getAnalista() {
        return this.analista;
    }

    public void setAnalista(analista analista) {
        this.analista = analista;
    }

}
