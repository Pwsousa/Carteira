package Composite;
import java.util.ArrayList;
import java.util.List;

public class Equipe implements Grupo {

    // Atributos 
    private Pessoa Dono;
    private String nome;
    private double Saldo;
    public List<Grupo> Grupos = new ArrayList<Grupo>();
    //private Carteira CarteiraColetiva;

    public Equipe(String nome) {
        this.nome = nome;
        this.Grupos = new ArrayList<Grupo>();
    }

    public void adicionarGrupo(Grupo Grupo) {
        Grupos.add(Grupo);
    }

    public void exibirDados() {
        System.out.println("Equipe: " + getNome());
        System.out.println("Componentes: ");
      
        for (Grupo Grupos : Grupos){
            Grupos.exibirDados();
        }
    }


    public boolean isGrupo(Grupo pessoa){
        for (int i = 0; i < Grupos.size(); i++) {
            if(Grupos.get(i).getNome() == pessoa.getNome()){
                return true;
            }
        }
        return false;
    }

    // Metodos Especiais 
        // Equipe
    public void setNomeEquipe(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

        // Dono 
    public void setDono(Pessoa Dono){
        this.Dono = Dono;
    }

    public Pessoa getDono(){
        return this.Dono;
    }

        // Saldo 
    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }
    public double getSaldo(){
        return Saldo;
    }
    
}