package br.com.unialfa.muralacademico.postagem.business;

import br.com.unialfa.muralacademico.pessoa.domain.Pessoa;
import br.com.unialfa.muralacademico.postagem.domain.Postagem;
import br.com.unialfa.muralacademico.postagem.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class PostagemBusiness {

    @Autowired
    private PostagemRepository postagemRepository;

    public Iterable<Postagem> listarPostagem() {
        return postagemRepository.findAll();
    }

    public void cadastrarPostagem(Postagem postagem) {
        postagemRepository.save(postagem);
    }

    public void editarPostagem(Postagem postagem) {
        postagemRepository.save(postagem);
    }

    public @ResponseBody
    void deletarPostagem (long id ) {
        postagemRepository.deleteById(id);
    }
}
