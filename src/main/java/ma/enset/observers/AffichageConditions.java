package ma.enset.observers;


import ma.enset.observable.DataMetio;
import ma.enset.observable.IDataMetio;

public class AffichageConditions implements Oberver ,Affichage{
    @Override
    public void afficher() {
        System.out.println("======affichage conditions===========");
    }
    @Override
    public void actualiser(IDataMetio dataMetio) {
    this.afficher();
        System.out.println("Pressure    :"+ ((DataMetio) dataMetio).getPressure());
        System.out.println("Humidity    :"+ ((DataMetio) dataMetio).getHumidity());
        System.out.println("Temperature :"+ ((DataMetio) dataMetio).getTemperature());
    }
}
