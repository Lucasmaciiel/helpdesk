package br.com.lmg.helpdesk.domain.enums;

import lombok.Getter;

@Getter
public enum Status {

    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private final Integer codigo;
    private final String descricao;

    Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Status toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (Status perfil : Status.values()) {
            if (codigo.equals(perfil.codigo)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
