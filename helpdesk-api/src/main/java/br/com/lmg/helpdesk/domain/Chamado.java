package br.com.lmg.helpdesk.domain;

import br.com.lmg.helpdesk.domain.enums.PrioridadeEnum;
import br.com.lmg.helpdesk.domain.enums.StatusEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Chamado {

    private Integer id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private PrioridadeEnum prioridade;
    private StatusEnum status;
    private String titulo;
    private String observacoes;
    private Tecnico tecnico;
    private Cliente cliente;

    public Chamado() {
        super();
    }

    public Chamado(Integer id, PrioridadeEnum prioridade, StatusEnum status, String titulo, String observacoes, Tecnico tecnico, Cliente cliente) {
        this.id = id;
        this.prioridade = prioridade;
        this.status = status;
        this.titulo = titulo;
        this.observacoes = observacoes;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }
}
