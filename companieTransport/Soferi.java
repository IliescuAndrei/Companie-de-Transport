package companieTransport;

public class Soferi extends Angajat {
    private String permis;

    public Soferi(String nume, String prenume, String CNP, String permis) {
        super(nume, prenume, CNP);
        this.permis = permis;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }


}
