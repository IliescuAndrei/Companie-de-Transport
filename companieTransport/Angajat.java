package companieTransport;

import java.util.Objects;


public class Angajat implements Comparable<Angajat> {
    private String nume;
    private String prenume;
    private String CNP;
    private Integer ifSofer;


    public Angajat(String nume, String prenume, String CNP) {
        this.setNume(nume);
        this.setPrenume(prenume);
        this.setCNP(CNP);
        ifSofer = 0;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Integer getIfSofer(){return ifSofer;}

    public void setIfSofer(Integer i){this.ifSofer = i;}

    @Override
    public int compareTo(Angajat a){
        return CNP.compareTo(a.CNP);
    }
}
