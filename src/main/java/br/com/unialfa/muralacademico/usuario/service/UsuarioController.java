package br.com.unialfa.muralacademico.usuario.service;

import br.com.unialfa.muralacademico.usuario.business.UsuarioBusiness;
import br.com.unialfa.muralacademico.usuario.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioBusiness usuarioBusiness;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Usuario> listarUsuario(){
        return usuarioBusiness.listarUsuario();
    }

    @PostMapping(path = "/add")
    public void cadastrarUsuario( @RequestBody Usuario usuario ) {
        usuarioBusiness.cadastrarUsuario(usuario);
    }

    @PutMapping(path = "/edit")
    public void editarUsuario( @RequestBody Usuario usuario ){
        usuarioBusiness.editarUsuario(usuario);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletarUsuario( @PathVariable(name = "id") long id ){
        usuarioBusiness.deletarUsuario(id);
    }

}
