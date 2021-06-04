package br.com.unialfa.muralacademico;

import br.com.unialfa.muralacademico.categoria.domain.Categoria;
import br.com.unialfa.muralacademico.categoria.repository.CategoriaRepository;
import br.com.unialfa.muralacademico.curso.domain.Curso;
import br.com.unialfa.muralacademico.curso.repository.CursoRepository;
import br.com.unialfa.muralacademico.endereco.domain.Endereco;
import br.com.unialfa.muralacademico.endereco.repository.EnderecoRepository;
import br.com.unialfa.muralacademico.palestrante.repository.PalestranteRepository;
import br.com.unialfa.muralacademico.palestrante.domain.Palestrante;
import br.com.unialfa.muralacademico.pessoa.domain.Pessoa;
import br.com.unialfa.muralacademico.pessoa.repository.PessoaRepository;
import br.com.unialfa.muralacademico.postagem.domain.Postagem;
import br.com.unialfa.muralacademico.postagem.repository.PostagemRepository;
import br.com.unialfa.muralacademico.telefone.domain.Telefone;
import br.com.unialfa.muralacademico.telefone.domain.TelefoneTipo;
import br.com.unialfa.muralacademico.telefone.repository.TelefoneRepository;
import br.com.unialfa.muralacademico.usuario.domain.Usuario;
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

	public static void main(String[] args) {
		SpringApplication.run(MuralacademicoApplication.class, args);
	}
	
	/*
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

	
	@Bean
	InitializingBean sendDatabase() {
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		Categoria categoria = new Categoria();
		categoria.setNome("Geral");
		categoria.setVersao(1);

		categoriaRepository.saveAll(categorias);

		List<Curso> cursos = new ArrayList<Curso>();
		Curso curso = new Curso();
		curso.setNome("Administração");
		curso.setVersao(1);

		cursoRepository.saveAll(cursos);

		List<Endereco> enderecos = new ArrayList<Endereco>();
		Endereco endereco = new Endereco();
		endereco.setRua("Rua t-01");
		endereco.setNumero("21");
		endereco.setBairro("Bueno");
		endereco.setCidade("Goiania");
		endereco.setVersao(1);

		enderecoRepository.saveAll(enderecos);

		List<Palestrante> palestrantes = new ArrayList<Palestrante>();
		Palestrante palestrante = new Palestrante();
		palestrante.setUsuario("admin");
		palestrante.setSenha("admin");
		palestrante.setVersao(1);

		palestranteRepository.saveAll(palestrantes);

		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		pessoa.setCPF("98390863081");
		pessoa.setNome("José");
		pessoa.setEmail("jose@gmail.com");
		pessoa.setVersao(1);
		pessoas.add(pessoa);

		pessoaRepository.saveAll(pessoas);

		List<Postagem> postagens = new ArrayList<Postagem>();
		Postagem postagem = new Postagem();
		postagem.setData(LocalDate.now());
		postagem.setConteudo("Treinamento para utilização da plataforma Mural Academico");
		postagem.setVersao(1);
		postagens.add(postagem);
		
		postagemRepository.saveAll(postagens);
		

		List<Telefone> telefones = new ArrayList<Telefone>();
		Telefone telefone = new Telefone();
		telefone.setNumero("99999-9999");
		telefone.setDDD("99");
		telefone.setCodigoArea("+99");
		telefone.setTipo(TelefoneTipo.celular);
		telefone.setVersao(1);

		telefoneRepository.saveAll(telefones);

		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		usuario.setUsuario("user");
		usuario.setSenha("user");
		usuario.setVersao(1);

		usuarioRepository.saveAll(usuarios);

		return null;
	}
	*/
}
