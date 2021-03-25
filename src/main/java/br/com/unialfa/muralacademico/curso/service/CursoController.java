package br.com.unialfa.muralacademico.curso.service;

import br.com.unialfa.muralacademico.curso.business.CursoBusiness;
import br.com.unialfa.muralacademico.curso.domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/curso")
public class CursoController {

    @Autowired
    private CursoBusiness cursoBusiness;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Curso> listarCurso(){
        return cursoBusiness.listarCurso();
    }

    @PostMapping(path = "/add")
    public void cadastrarCurso( @RequestBody Curso curso ) {
        cursoBusiness.cadastrarCurso(curso);
    }

    @PutMapping(path = "/edit")
    public void editarCurso( @RequestBody Curso curso ){
        cursoBusiness.editarCurso(curso);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletarCurso( @PathVariable(name = "id") long id ){
        cursoBusiness.deletarCurso(id);
    }

}
