package Notificador;
import java.util.List;
import Composite.Grupo;

public class ObserverCarteira implements FacadeObserver{
    
    private List<Observer> observers;

    public void adicionarObserver(Observer Observer){
        observers.add(Observer);
    }

    public void notificarObservers(Grupo Grupo, double saldo){
        for (Observer Observer: observers){
            Observer.notificar(Grupo,saldo);
        }
    }

    public void removerObserver(Observer Observer){
        observers.remove(Observer);
    }

    public void notificar(Grupo Grupo,double saldo){
        System.out.println("Notificação de alteração: " + Grupo + ": Saldo atual: " + saldo);
    }

}
