package br.com.lmg.helpdesk.domain.enums;

import lombok.Getter;

@Getter
public enum PerfilEnum {

    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    private final Integer codigo;
    private final String descricao;

    PerfilEnum(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static PerfilEnum toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (PerfilEnum perfil : PerfilEnum.values()) {
            if (codigo.equals(perfil.codigo)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Perfil inválido");
    }
}
