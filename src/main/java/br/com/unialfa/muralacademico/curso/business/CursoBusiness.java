package br.com.unialfa.muralacademico.curso.business;

import br.com.unialfa.muralacademico.categoria.domain.Categoria;
import br.com.unialfa.muralacademico.curso.domain.Curso;
import br.com.unialfa.muralacademico.curso.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class CursoBusiness {

    @Autowired
    private CursoRepository cursoRepository;

    public Iterable<Curso> listarCurso() {
        return cursoRepository.findAll();
    }

    public void cadastrarCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    public void editarCurso (Curso curso) {
        cursoRepository.save(curso);
    }

    public @ResponseBody
    void deletarCurso (long id ) {
        cursoRepository.deleteById(id);
    }

}
