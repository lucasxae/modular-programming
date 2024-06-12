public enum EAnalista {
    JUNIOR("Junior", 3500.00),
    SENIOR("Senior", 4550.00);

    private String descricao;
    private Double salarioBase;

    EAnalista(String descricao, Double salarioBase) {
        this.descricao = descricao;
        this.salarioBase = salarioBase;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public static EAnalista getAnalista(String descricao) {
        for (EAnalista analista : EAnalista.values()) {
            if (analista.getDescricao().equals(descricao)) {
                return analista;
            }
        }
        return null;
    }
}
