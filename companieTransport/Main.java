package companieTransport;

public class Main {

    public static void main(String[] args) {
        Serviciu_IO serviciu = Serviciu_IO.getInstance();

//        serviciu.adaugareSofer();
//        serviciu.adaugareSofer();
//        serviciu.adaugareSofer();
//        serviciu.afisareAngajatiSortCNP();
//        serviciu.afisareAngajatiSortNume();

//        serviciu.citesteOraseCSV();
//        serviciu.afisareOrase();
//        serviciu.adaugareOras();
//        serviciu.scrieOrasCSV();
//        serviciu.citesteOraseCSV();
//        serviciu.afisareOrase();

//        serviciu.citesteAngajatiCSV();
//        serviciu.adaugareSofer();
//        serviciu.adaugareSofer();
//        serviciu.scrieAngajatCSV();

//        serviciu.citesteAutomobilCSV();
//        serviciu.scrieAutomobilCSV();



//        serviciu.citesteAutomobilCSV();
//        serviciu.scrieAutomobilCSV();
//        serviciu.citesteAutomobilCSV();
//        serviciu.scrieAutomobilCSV();



        //serviciu.audit("Incepe");
        serviciu.citesteAutomobilCSV();
        serviciu.citesteAngajatiCSV();
        serviciu.citesteOraseCSV();
        serviciu.citesteRuteCSV();
        //serviciu.audit("Gata");

        serviciu.hardDepozite();
        serviciu.hardCurse();

        Meniu meniu = new Meniu();
        meniu.meniu();
    }
}
