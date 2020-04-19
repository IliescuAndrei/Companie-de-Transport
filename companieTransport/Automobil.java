package companieTransport;

public class Automobil {
    private String nrInmatriculare;
    private Integer nrLocuri;
    private Boolean functional;


    public Automobil(String nrInmatriculare, Integer nrLocuri, Boolean functional) {
        this.setNrInmatriculare(nrInmatriculare);
        this.setNrLocuri(nrLocuri);
        this.setFunctional(functional);
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public Integer getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public Boolean getFunctional() {
        return functional;
    }

    public void setFunctional(Boolean functional) {
        this.functional = functional;
    }
}
