package br.com.unialfa.muralacademico.palestrante.domain;

import br.com.unialfa.muralacademico.postagem.domain.Postagem;
import br.com.unialfa.muralacademico.usuario.domain.Usuario;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Palestrante extends Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<Postagem> postagem;

    public Palestrante() {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
