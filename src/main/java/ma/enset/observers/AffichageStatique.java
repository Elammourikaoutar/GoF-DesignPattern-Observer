package ma.enset.observers;


import ma.enset.observable.IDataMetio;

public class AffichageStatique implements Oberver , Affichage{
    @Override
    public void afficher() {
        System.out.println("===========affichage statique=============");
    }

    @Override
    public void actualiser(IDataMetio dataMetio) {
           this.afficher();

    }
}
