public class Livraison {
    protected Integer adresssEnlevement;
    protected Integer adresssLivraison;
    protected Integer dureeEnlevement;
    protected Integer dureeLivraison;

    public Livraison(Integer adresssEnlevement, Integer adresssLivraison, Integer dureeEnlevement, Integer dureeLivraison) {
        this.adresssEnlevement = adresssEnlevement;
        this.adresssLivraison = adresssLivraison;
        this.dureeEnlevement = dureeEnlevement;
        this.dureeLivraison = dureeLivraison;
    }

    public Integer getAdresssEnlevement() {
        return adresssEnlevement;
    }

    public Integer getAdresssLivraison() {
        return adresssLivraison;
    }

    public Integer getDureeEnlevement() {
        return dureeEnlevement;
    }

    public Integer getDureeLivraison() {
        return dureeLivraison;
    }
}