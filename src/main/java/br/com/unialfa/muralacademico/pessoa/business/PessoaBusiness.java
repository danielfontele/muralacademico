package br.com.unialfa.muralacademico.pessoa.business;

import br.com.unialfa.muralacademico.pessoa.domain.Pessoa;
import br.com.unialfa.muralacademico.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.InputMismatchException;

@Service
public class PessoaBusiness {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Iterable<Pessoa> listarPessoa() {
        return pessoaRepository.findAll();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (isCPF(pessoa.getCPF())) {
            pessoaRepository.save(pessoa);
        } else {
            System.err.println("CPF Inválido!");
        }
    }

    public void editarPessoa(Pessoa pessoa) {
        if (isCPF(pessoa.getCPF())) {
            pessoaRepository.save(pessoa);
        } else {
            System.err.println("CPF Inválido!");
        }
    }

    public @ResponseBody void deletarPessoa(long id) {
        pessoaRepository.deleteById(id);
    }

    public static boolean isCPF(String CPF) {
        // retirar caractéres especiais do cpf
        CPF = CPF.replaceAll("\\.", "");
        CPF = CPF.replaceAll("-", "");

        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
                || CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
                || CPF.equals("99999999999") || (CPF.length() != 11))
            return (false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else
                dig11 = (char) (r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                return (true);
            else
                return (false);
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
}
