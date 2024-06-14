package br.com.lmg.helpdesk.domain.enums;

import lombok.Getter;

@Getter
public enum Prioridade {

    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private final Integer codigo;
    private final String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Prioridade toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (Prioridade perfil : Prioridade.values()) {
            if (codigo.equals(perfil.codigo)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");
    }
}
