package br.com.unialfa.muralacademico.categoria.business;

import br.com.unialfa.muralacademico.categoria.domain.Categoria;
import br.com.unialfa.muralacademico.categoria.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class CategoriaBusiness {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Iterable<Categoria> listarCategoria() {
        return categoriaRepository.findAll();
    }

    public void cadastrarCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public void editarCategoria (Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public @ResponseBody void deletarCategoria (long id ) {
        categoriaRepository.deleteById(id);
    }

}
