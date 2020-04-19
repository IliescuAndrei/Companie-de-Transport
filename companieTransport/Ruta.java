package companieTransport;

public class Ruta {
    private String orasPlecare;
    private String orasDestinatie;
    private Integer numarKilometri;
    private Integer numarMinute;


    public Ruta(String orasPlecare, String orasDestinatie, Integer numarKilometri, Integer numarMinute) {
        this.orasPlecare = orasPlecare;
        this.orasDestinatie = orasDestinatie;
        this.numarKilometri = numarKilometri;
        this.numarMinute = numarMinute;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getOrasDestinatie() {
        return orasDestinatie;
    }

    public void setOrasDestinatie(String orasDestinatie) {
        this.orasDestinatie = orasDestinatie;
    }

    public Integer getNumarKilometri() {
        return numarKilometri;
    }

    public void setNumarKilometri(Integer numarKilometri) {
        this.numarKilometri = numarKilometri;
    }

    public Integer getNumarMinute() {
        return numarMinute;
    }

    public void setNumarMinute(Integer numarMinute) {
        this.numarMinute = numarMinute;
    }
}
