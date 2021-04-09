package br.com.unialfa.muralacademico;

import br.com.unialfa.muralacademico.categoria.repository.CategoriaRepository;
import br.com.unialfa.muralacademico.curso.repository.CursoRepository;
import br.com.unialfa.muralacademico.endereco.repository.EnderecoRepository;
import br.com.unialfa.muralacademico.palestrante.repository.PalestranteRepository;
import br.com.unialfa.muralacademico.pessoa.repository.PessoaRepository;
import br.com.unialfa.muralacademico.postagem.domain.Postagem;
import br.com.unialfa.muralacademico.postagem.repository.PostagemRepository;
import br.com.unialfa.muralacademico.telefone.repository.TelefoneRepository;
import br.com.unialfa.muralacademico.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MuralacademicoApplication {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PalestranteRepository palestranteRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

	@Autowired
	private PostagemRepository postagemRepository;

	@Autowired
	private TelefoneRepository telefoneRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MuralacademicoApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {

		List<Postagem> postagens = new ArrayList<Postagem>();
		Postagem postagem = new Postagem();
		postagem.setData(LocalDate.now());
		postagem.setConteudo("Treinamento para utilização da plataforma Mural Academico");
		postagem.setVersao(1);
		postagens.add(postagem);

		postagemRepository.saveAll(postagens);

		return null;
	}

}
