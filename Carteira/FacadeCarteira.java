package Carteira;
import Composite.*;

public interface FacadeCarteira {
    void adicionarLancamento(Equipe Grupo, double valor, Grupo Pessoa, String Descricao);
    double calcularSaldo(Grupo Grupo);
}