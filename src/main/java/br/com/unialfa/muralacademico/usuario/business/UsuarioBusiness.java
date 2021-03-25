package br.com.unialfa.muralacademico.usuario.business;

import br.com.unialfa.muralacademico.telefone.domain.Telefone;
import br.com.unialfa.muralacademico.usuario.domain.Usuario;
import br.com.unialfa.muralacademico.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UsuarioBusiness {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void editarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public @ResponseBody
    void deletarUsuario (long id ) {
        usuarioRepository.deleteById(id);
    }
}
