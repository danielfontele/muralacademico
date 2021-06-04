package br.com.unialfa.muralacademico.telefone.business;

import br.com.unialfa.muralacademico.telefone.domain.Telefone;
import br.com.unialfa.muralacademico.telefone.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class TelefoneBusiness {

    @Autowired
    private TelefoneRepository telefoneRepository;

    public Iterable<Telefone> listarTelefone() {
        return telefoneRepository.findAll();
    }

    public void cadastrarTelefone(Telefone telefone) {
        telefoneRepository.save(telefone);
    }

    public void editarTelefone(Telefone telefone) {
        telefoneRepository.save(telefone);
    }

    public @ResponseBody
    void deletarTelefone (long id ) {
        telefoneRepository.deleteById(id);
    }
}
