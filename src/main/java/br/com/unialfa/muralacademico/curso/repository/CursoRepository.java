package br.com.unialfa.muralacademico.curso.repository;

import br.com.unialfa.muralacademico.curso.domain.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
