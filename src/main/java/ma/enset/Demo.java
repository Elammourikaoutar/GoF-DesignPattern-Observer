package ma.enset;




import ma.enset.observable.DataMetio;
import ma.enset.observers.AffichageConditions;
import ma.enset.observers.AffichagePrevisions;
import ma.enset.observers.AffichageStatique;
import ma.enset.observers.Oberver;

public class Demo {
    public static void main(String[] args) {
        DataMetio dataMetio=new DataMetio();
        Oberver observer1=new AffichageConditions();
        Oberver observer2=new AffichageStatique();
        Oberver observer3=new AffichagePrevisions();
        dataMetio.addObserver(observer1);
        dataMetio.addObserver(observer2);
        dataMetio.addObserver(observer3);
        dataMetio.setMesure(34,120,18);

    }
}
