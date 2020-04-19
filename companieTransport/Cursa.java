package companieTransport;

public class Cursa {
    private Ruta ruta;
    private Automobil automobil;
    private Angajat angajat;
    private String data;
    private String ora;


    public Cursa(Ruta ruta, Automobil automobil, Angajat angajat, String data, String ora) {
        this.setRuta(ruta);
        this.setAutomobil(automobil);
        this.setAngajat(angajat);
        this.setData(data);
        this.setOra(ora);
    }


    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Automobil getAutomobil() {
        return automobil;
    }

    public void setAutomobil(Automobil automobil) {
        this.automobil = automobil;
    }

    public Angajat getAngajat() {
        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
}
