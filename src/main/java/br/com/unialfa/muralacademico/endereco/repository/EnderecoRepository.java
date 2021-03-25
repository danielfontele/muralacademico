package br.com.unialfa.muralacademico.endereco.repository;

import br.com.unialfa.muralacademico.endereco.domain.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
