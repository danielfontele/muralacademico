package br.com.unialfa.muralacademico.categoria.service;

import br.com.unialfa.muralacademico.categoria.business.CategoriaBusiness;
import br.com.unialfa.muralacademico.categoria.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/Categoria")
public class CategoriaController {

    @Autowired
    private CategoriaBusiness categoriaBusiness;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Categoria> listarCategoria(){
        return categoriaBusiness.listarCategoria();
    }

    @PostMapping(path = "/add")
    public void cadastrarCategoria( @RequestBody Categoria categoria ) {
        categoriaBusiness.cadastrarCategoria(categoria);
    }

    @PutMapping(path = "/edit")
    public void editarCategoria( @RequestBody Categoria categoria ){
        categoriaBusiness.editarCategoria(categoria);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletarCategoria( @PathVariable(name = "id") long id ){
        categoriaBusiness.deletarCategoria(id);
    }

}
