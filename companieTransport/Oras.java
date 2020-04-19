package companieTransport;

public class Oras implements Comparable<Oras>{
    private String numeOras;
    private Integer numarStatii;


    public Oras(String numeOras, Integer numarStatii) {
        this.setNumeOras(numeOras);
        this.setNumarStatii(numarStatii);
    }

    public String getNumeOras() {
        return numeOras;
    }

    public void setNumeOras(String numeOras) {
        this.numeOras = numeOras;
    }

    public Integer getNumarStatii() {
        return numarStatii;
    }

    public void setNumarStatii(Integer numarStatii) {
        this.numarStatii = numarStatii;
    }


    @Override
    public int compareTo(Oras o) {
        return numeOras.compareTo(o.getNumeOras());
    }
}
