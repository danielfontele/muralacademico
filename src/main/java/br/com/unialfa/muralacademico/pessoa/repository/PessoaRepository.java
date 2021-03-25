package br.com.unialfa.muralacademico.pessoa.repository;

import br.com.unialfa.muralacademico.pessoa.domain.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
