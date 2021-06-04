package br.com.unialfa.muralacademico.postagem.domain;

import br.com.unialfa.muralacademico.categoria.domain.Categoria;
import br.com.unialfa.muralacademico.curso.domain.Curso;
import br.com.unialfa.muralacademico.palestrante.domain.Palestrante;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Postagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String conteudo;
    private LocalDate data;
    private Nivel nivel;
    private int versao;

    @ManyToOne(cascade = CascadeType.ALL)
    private Palestrante palestrante;

    @OneToOne
    private Curso curso;

    @OneToOne
    private Categoria categoria;

    public Postagem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public Nivel getNivel() {
        return this.nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Palestrante getPalestrante() {
        return this.palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
