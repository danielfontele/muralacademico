package br.com.unialfa.muralacademico.postagem.repository;

import br.com.unialfa.muralacademico.postagem.domain.Postagem;
import org.springframework.data.repository.CrudRepository;

public interface PostagemRepository extends CrudRepository<Postagem, Long> {
}
