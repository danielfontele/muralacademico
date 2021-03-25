package br.com.unialfa.muralacademico.categoria.domain;

import br.com.unialfa.muralacademico.postagem.domain.Postagem;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String nome;
    private int versao;

    @OneToOne
    @JoinColumn
    private Postagem postagem;

    public Categoria() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

}
