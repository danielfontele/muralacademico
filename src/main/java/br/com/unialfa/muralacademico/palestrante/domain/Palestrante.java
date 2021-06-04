package br.com.unialfa.muralacademico.palestrante.domain;

import br.com.unialfa.muralacademico.postagem.domain.Postagem;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Palestrante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String usuario;
    private String senha;
    private int versao;

    @OneToMany
    private List<Postagem> postagem;

    public Palestrante() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getVersao() {
        return this.versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public List<Postagem> getPostagem() {
        return this.postagem;
    }

    public void setPostagem(List<Postagem> postagem) {
        this.postagem = postagem;
    }

}
