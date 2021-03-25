package br.com.unialfa.muralacademico.usuario.repository;

import br.com.unialfa.muralacademico.usuario.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
