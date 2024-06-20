package br.com.lmg.helpdesk.domain;


import br.com.lmg.helpdesk.domain.enums.PerfilEnum;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@EqualsAndHashCode(of = {"id", "cpf"})
public abstract class Pessoa {

    protected Integer id;
    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;
    protected Set<Integer> perfis = new HashSet<>();
    protected LocalDate dataCriacao = LocalDate.now();

    protected Pessoa() {
        super();
        addPerfil(PerfilEnum.CLIENTE);
    }

    protected Pessoa(Integer id, String nome, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        addPerfil(PerfilEnum.CLIENTE);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<PerfilEnum> getPerfis() {
        return perfis.stream().map(PerfilEnum::toEnum).collect(Collectors.toSet());
    }

    public void addPerfil(PerfilEnum perfil) {
        this.perfis.add(perfil.getCodigo());
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
