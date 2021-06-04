package br.com.unialfa.muralacademico.palestrante.business;

import br.com.unialfa.muralacademico.palestrante.domain.Palestrante;
import br.com.unialfa.muralacademico.palestrante.repository.PalestranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class PalestranteBusiness {

    @Autowired
    private PalestranteRepository palestranteRepository;

    public Iterable<Palestrante> listarPalestrante() {
        return palestranteRepository.findAll();
    }

    public void cadastrarPalestrante(Palestrante palestrante) {
        palestranteRepository.save(palestrante);
    }

    public void editarPalestrante(Palestrante palestrante) {
        palestranteRepository.save(palestrante);
    }

    public @ResponseBody void deletarPalestrante(long id) {
        palestranteRepository.deleteById(id);
    }
}
