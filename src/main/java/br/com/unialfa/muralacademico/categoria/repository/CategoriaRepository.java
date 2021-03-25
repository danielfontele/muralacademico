package br.com.unialfa.muralacademico.categoria.repository;

import br.com.unialfa.muralacademico.categoria.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
}
