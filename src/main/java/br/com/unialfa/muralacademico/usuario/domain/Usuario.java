package br.com.unialfa.muralacademico.usuario.domain;

import br.com.unialfa.muralacademico.palestrante.domain.Palestrante;
import br.com.unialfa.muralacademico.pessoa.domain.Pessoa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String usuario;
    private String senha;
    private int versao;

    @OneToOne
    @JoinColumn
    private Pessoa pessoa;

    @OneToOne
    private Palestrante palestrante;

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }
}
