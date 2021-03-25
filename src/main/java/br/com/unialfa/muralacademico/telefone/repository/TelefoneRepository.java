package br.com.unialfa.muralacademico.telefone.repository;

import br.com.unialfa.muralacademico.telefone.domain.Telefone;
import org.springframework.data.repository.CrudRepository;

public interface TelefoneRepository extends CrudRepository<Telefone, Long> {
}
