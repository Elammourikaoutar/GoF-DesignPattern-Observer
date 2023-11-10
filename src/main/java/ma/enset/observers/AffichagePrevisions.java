package ma.enset.observers;


import ma.enset.observable.IDataMetio;

public class AffichagePrevisions implements Oberver ,Affichage{
    double max =0;
    @Override
    public void afficher() {
        System.out.println("==============affichage previsions===========");
    }

    @Override
    public void actualiser(IDataMetio dataMetio) {
    this.afficher();

    }
}
