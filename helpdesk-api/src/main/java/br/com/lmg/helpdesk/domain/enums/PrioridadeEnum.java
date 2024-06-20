package br.com.lmg.helpdesk.domain.enums;

import lombok.Getter;

@Getter
public enum PrioridadeEnum {

    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private final Integer codigo;
    private final String descricao;

    PrioridadeEnum(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static PrioridadeEnum toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (PrioridadeEnum perfil : PrioridadeEnum.values()) {
            if (codigo.equals(perfil.codigo)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Prioridade inválida");
    }
}
