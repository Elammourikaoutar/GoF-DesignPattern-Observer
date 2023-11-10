package ma.enset.observable;


import ma.enset.observers.Oberver;

public interface IDataMetio {
    void   addObserver(Oberver observer);
    void   deleteObserver(Oberver observer);
    void   notifay();
}
