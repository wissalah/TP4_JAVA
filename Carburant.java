public enum Carburant {
    ESSENCE(10.0), GAZ(18.0), DIESEL(12.0);

    private final double quantite;

    Carburant(double quantite) {
        this.quantite = quantite;
    }

    public double getQuantite() {
        return quantite;
    }
}
