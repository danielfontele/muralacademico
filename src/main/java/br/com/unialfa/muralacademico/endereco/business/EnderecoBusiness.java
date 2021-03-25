package br.com.unialfa.muralacademico.endereco.business;

import br.com.unialfa.muralacademico.endereco.domain.Endereco;
import br.com.unialfa.muralacademico.endereco.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class EnderecoBusiness {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Iterable<Endereco> listarEndereco() {
        return enderecoRepository.findAll();
    }

    public void cadastrarEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public void editarEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public @ResponseBody
    void deletarEndereco (long id ) {
        enderecoRepository.deleteById(id);
    }
}
