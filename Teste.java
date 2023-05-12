import Carteira.*;
import Composite.*;
public class Teste {
    public static void main(String[] args) {
    
        // Criando as pessoas
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");
        Pessoa pessoa3 = new Pessoa("Pedro");
        Pessoa pessoa4 = new Pessoa("Ana");

        // Criando a equipe e adicionando as pessoas
        Equipe equipe1 = new Equipe("Equipe 1");
        equipe1.adicionarGrupo(pessoa1);
        equipe1.adicionarGrupo(pessoa2);

        // Criando a equipe e adicionando as pessoas
        Equipe equipe2 = new Equipe("Equipe 1");
        equipe2.adicionarGrupo(pessoa3);
        equipe2.adicionarGrupo(pessoa4);

        // Criando a fachada da caixinha
        FacadeCarteira caixinhaFacade = new Carteira();
        System.out.println('-');
        equipe1.exibirDados();


        // Adicionando lançamentos de pagamentos e créditos através da fachada
        caixinhaFacade.adicionarLancamento(equipe1, 200.0, pessoa1, "Dinheiro para doacao"); // Crédito de 200
        caixinhaFacade.adicionarLancamento(equipe1, 100.0, pessoa2, "Dinheiro para doacao"); // Crédito de 200
        caixinhaFacade.adicionarLancamento(equipe1, 0, pessoa4, "Dinheiro");
        // Adicionando lançamentos de pagamentos e créditos através da fachada



}
}
