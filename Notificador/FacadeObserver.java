package Notificador;
import Composite.*;


interface Observer {
    void notificar(Grupo Grupo, double Saldo);
}

interface FacadeObserver {
    void adicionarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers(Grupo componente, double saldo);
}