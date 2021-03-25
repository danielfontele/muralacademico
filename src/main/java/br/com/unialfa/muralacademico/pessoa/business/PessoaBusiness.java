package br.com.unialfa.muralacademico.pessoa.business;

import br.com.unialfa.muralacademico.pessoa.domain.Pessoa;
import br.com.unialfa.muralacademico.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class PessoaBusiness {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Iterable<Pessoa> listarPessoa() {
        return pessoaRepository.findAll();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public void editarPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public @ResponseBody
    void deletarPessoa (long id ) {
        pessoaRepository.deleteById(id);
    }
}
