package companieTransport;

public class Depozit {
    private Oras oras;
    private String strada;
    private Integer numarLocuri;
    private Automobil[] automobile;


    public Depozit(Oras oras, String strada, Integer numarLocuri, Automobil[] automobile) {
        this.setOras(oras);
        this.setStrada(strada);
        this.setNumarLocuri(numarLocuri);
        this.setAutomobile(automobile);
    }

    public Oras getOras() {
        return oras;
    }

    public void setOras(Oras oras) {
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public Integer getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(Integer numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public Automobil[] getAutomobile() {
        return automobile;
    }

    public void setAutomobile(Automobil[] automobile) {
        this.automobile = automobile;
    }
}
