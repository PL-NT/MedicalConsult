package br.com.pauloneto.medicalsystem.Usuario.Domain;

public enum Permissao {
    ADMIN("ADMIN"),
    SECRETARIO("SECRETARIO"),
    PACIENTE("PACIENTE");
    private final String descricao;

    Permissao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}

