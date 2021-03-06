package br.com.unialfa.muralacademico.pessoa.domain;

import br.com.unialfa.muralacademico.telefone.domain.Telefone;
import br.com.unialfa.muralacademico.usuario.domain.Usuario;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    @Column(unique = true)
    private String CPF;
    private String email;
    private int versao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones;

    @ManyToOne
    private Telefone telefone;

    @OneToOne
    private Usuario usuario;

    public Pessoa() {
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }
}
