public class Humain {
    private String nom;
    private int lifePoints;

    public Humain(String nom) {
        this.nom = nom;
        this.lifePoints = 10;
    }

    public void fire(Robot robot) {
        System.out.println("l'humain a rate sa cible");
    }

    public void fire(Humain humain) {
        System.out.println("l'humain a rate sa cible");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
