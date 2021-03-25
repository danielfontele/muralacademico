package br.com.unialfa.muralacademico.palestrante.repository;

import br.com.unialfa.muralacademico.palestrante.domain.Palestrante;
import org.springframework.data.repository.CrudRepository;

public interface PalestranteRepository extends CrudRepository<Palestrante, Long> {
}
