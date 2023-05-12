package Composite;
public class Pessoa implements Grupo {
    private String nome;
    private double Saldo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Pessoa: " + getNome());
    }

    public String getNome (){
        return this.nome;
    }

    public double getSaldo(){
        return this.Saldo;
    }

    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }
}