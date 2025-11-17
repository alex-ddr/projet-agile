



public class Entrepot {
    protected Integer adresss;
    protected LocalTime heureDepart;


    public Entrepot(LocalTime heureDepart, Integer adresss) {
        this.heureDepart = heureDepart;
        this.adresss = adresss;
    }

    public Integer getAdresss() {
        return adresss;
    }

    public LocalTime getHeureDepart() {
        return heureDepart;
    }
}