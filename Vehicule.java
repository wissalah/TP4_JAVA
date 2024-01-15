import java.io.Serializable;

abstract class Vehicule implements Motorisation, Serializable {
    private String matricule;
    private int Annee;
    private double prix;
    private String modele;
    private Carburant carburant;

    public Vehicule(String matricule, int Annee, double prix, String modele) {
        this.matricule = matricule;
        this.Annee = Annee;
        this.prix = prix;
        this.modele = modele;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getAnnee() {
        return Annee;
    }

    public void setAnnee(int Annee) {
        this.Annee = Annee;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Carburant getCarburant() {
        return carburant;
    }

    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }

    public abstract void addCarburant(double carburant);

    public Carburant typeCarburant() {
        return carburant;
    }

    public void periodiciteVidange() {
        switch (carburant) {
            case DIESEL:
                System.out.println("Vidange every 10,000 km");
                break;
            case ESSENCE:
                System.out.println("Vidange every 12,000 km");
                break;
            case GAZ:
                System.out.println("Vidange every 18,000 km");
                break;
            default:
                System.out.println("Invalid Carburant type");
        }
    }
}
