public enum ETipoFuncionario {
    ANALISTA("Analista"),
    GERENTE("Gerente"),
    DIRETOR("Diretor");

    private String descricao;

    ETipoFuncionario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static ETipoFuncionario getTipoFuncionario(String descricao) {
        for (ETipoFuncionario tipoFuncionario : ETipoFuncionario.values()) {
            if (tipoFuncionario.getDescricao().equals(descricao)) {
                return tipoFuncionario;
            }
        }
        return null;
    }
}
