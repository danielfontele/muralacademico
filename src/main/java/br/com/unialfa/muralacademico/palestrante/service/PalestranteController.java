package br.com.unialfa.muralacademico.palestrante.service;

import br.com.unialfa.muralacademico.palestrante.business.PalestranteBusiness;
import br.com.unialfa.muralacademico.palestrante.domain.Palestrante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/palestrante")
public class PalestranteController {

    @Autowired
    private PalestranteBusiness palestranteBusiness;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Palestrante> listarPalestrante(){
        return palestranteBusiness.listarPalestrante();
    }

    @PostMapping(path = "/add")
    public void cadastrarPalestrante( @RequestBody Palestrante palestrante ) {
        palestranteBusiness.cadastrarPalestrante(palestrante);
    }

    @PutMapping(path = "/edit")
    public void editarPalestrante( @RequestBody Palestrante palestrante ){
        palestranteBusiness.editarPalestrante(palestrante);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletarPalestrante( @PathVariable(name = "id") long id ){
        palestranteBusiness.deletarPalestrante(id);
    }

}
