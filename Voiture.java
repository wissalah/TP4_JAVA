import java.io.Serializable;

public class Voiture extends Vehicule implements Decapotable, Serializable {
    private static int nbMaxVoitures = 10;
    private static int capacite = 60;
    private static int nbVoitures = 0;
    private double quantite;  
    private Carburant carburant;
    private int periodiciteVidange;
    private boolean toitReplie;

    private Voiture(int modele, Carburant carburant) {
        super(String.valueOf(modele), 0, 0.0, String.valueOf(modele));
        this.carburant = carburant;
    }

    public static Voiture creerVoiture(int modele, Carburant carburant) {
        if (nbVoitures < nbMaxVoitures) return new Voiture(modele, carburant);
        else {
            System.out.println("Nombre max de voiture est atteint et le parc est fermé");
            return null;
        }
    }

    public void addCarburant(double carburant) {
        if ((getQuantite() + carburant) <= capacite)
            setQuantite(getQuantite() + carburant);
        else {
            double max_carburant_ajout = capacite - getQuantite();
            this.setQuantite(capacite);
            System.out.println("la quantite :" + (carburant - max_carburant_ajout) + " a debordé");
        }
    }

    public Carburant typeCarburant() {
        return carburant;
    }

    public void periodiciteVidange() {
        switch (carburant) {
            case DIESEL:
                periodiciteVidange = 10;
                break;
            case ESSENCE:
                periodiciteVidange = 12;
                break;
            case GAZ:
                periodiciteVidange = 18;
                break;
            default:
                periodiciteVidange = 12;
                break;
        }
    }

    public void replieLeToit() {
        toitReplie = true;
    }

    public int getPeriodiciteeVidange() {
        return periodiciteVidange;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String toString() {
        return "Voiture " + super.toString() + ", type du carburant: " + carburant + ", quantite de carburant: " + quantite + ", periodicite de vidange: " + periodiciteVidange + " mois";
    }
}
