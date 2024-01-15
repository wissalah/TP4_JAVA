import java.io.Serializable;

public class Camion extends Vehicule implements Serializable {
    private double Capacite;
    private double Quantite;
    private int nbmaxcamion = 10;

    public Camion(double Capacite, double Quantite, String matricule, int Annee, double prix, String modele) {
        super(matricule, Annee, prix, modele);
        this.Capacite = Capacite;
        this.Quantite = Quantite;
    }

    public Camion(double Capacite, double Quantite, String matricule, int Annee, double prix, String modele, Carburant carburant) {
        super(matricule, Annee, prix, modele);
        this.Capacite = Capacite;
        this.Quantite = Quantite;
        this.setCarburant(carburant); 
    }

    public void addCarburant(double carburant) {
        if ((getQuantite() + carburant) <= Capacite) {
            setQuantite(getQuantite() + carburant);
        } else {
            double max_carburant_ajout = Capacite - getQuantite();
            setQuantite(Capacite);
            System.out.println("la quantite :" + (carburant - max_carburant_ajout) + " a debordé");
        }
    }

    public String toString() {
        return " Camion : " + super.toString() + " Capacite " + Capacite + " Quantite " + Quantite + "  } ";
    }

    public double getQuantite() {
        return Quantite;
    }

    public void setQuantite(double Quantite) {
        this.Quantite = Quantite;
    }
}
