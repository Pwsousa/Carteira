package Carteira;

import java.util.HashMap;
import java.util.Map;

import Composite.*;
//import Notificador.*;

public class Carteira implements FacadeCarteira{
    private static Carteira instance;

    private Map<Grupo, Double> lancamentos;

    public Carteira(){
        lancamentos = new HashMap<>();

    }

    public static Carteira getInstance() {
        if (instance == null) {
            synchronized (Carteira.class) {
                if (instance == null) {
                    instance = new Carteira();
                }
            }
        }
        return instance;
    }
    
    public void adicionarLancamento(Equipe Grupos, double valor, Grupo Pessoa, String Descricao){
        if(Grupos.isGrupo(Pessoa) == false){
            System.out.println(Pessoa.getNome() + " voce nao esta na equipe: " + Grupos.getNome() + " ,logo nao pode adicionar lancamento a este grupo");
        }
        else{
            if ((Grupos.getSaldo() <= 0) && valor < 0) {
                System.out.println("Essa operacao nao pode ser realizada");
            }
            else{
                
                System.out.println("Debitando...");
                System.out.println("Pessoa: " + Pessoa.getNome());
                System.out.println("Valor " + valor);
                System.out.println("Saldo Anterior: " + Grupos.getSaldo());
                Grupos.setSaldo(Grupos.getSaldo() + valor);
                System.out.println("Saldo Atual: " + Grupos.getSaldo());
            
            }
        }
    }
   
    public double calcularSaldo(Grupo componente) {
        return lancamentos.getOrDefault(componente, 0.0);
    }
}