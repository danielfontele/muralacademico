package br.com.unialfa.muralacademico.postagem.service;

import br.com.unialfa.muralacademico.postagem.business.PostagemBusiness;
import br.com.unialfa.muralacademico.postagem.domain.Postagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/postagem")
public class PostagemController {

    @Autowired
    private PostagemBusiness postagemBusiness;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Postagem> listarPostagem(){
        return postagemBusiness.listarPostagem();
    }

    @PostMapping(path = "/add")
    public void cadastrarPostagem( @RequestBody Postagem postagem ) {
        postagemBusiness.cadastrarPostagem(postagem);
    }

    @PutMapping(path = "/edit")
    public void editarPostagem( @RequestBody Postagem postagem ){
        postagemBusiness.editarPostagem(postagem);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletarPostagem( @PathVariable(name = "id") long id ){
        postagemBusiness.deletarPostagem(id);
    }

}
