package br.com.unialfa.muralacademico.pessoa.service;

import br.com.unialfa.muralacademico.pessoa.business.PessoaBusiness;
import br.com.unialfa.muralacademico.pessoa.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaBusiness pessoaBusiness;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Pessoa> listarPessoa(){
        return pessoaBusiness.listarPessoa();
    }

    @PostMapping(path = "/add")
    public void cadastrarPessoa( @RequestBody Pessoa pessoa ) {
        pessoaBusiness.cadastrarPessoa(pessoa);
    }

    @PutMapping(path = "/edit")
    public void editarPessoa( @RequestBody Pessoa pessoa ){
        pessoaBusiness.editarPessoa(pessoa);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletarPessoa( @PathVariable(name = "id") long id ){
        pessoaBusiness.deletarPessoa(id);
    }

}
