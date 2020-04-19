package companieTransport;

import java.util.Scanner;

public class Meniu {

    public Meniu() {
    }

    private Serviciu_IO serviciu = Serviciu_IO.getInstance();

    public void meniu(){
        Scanner sc = new Scanner(System.in);
        Integer alegere = -1;

        while(alegere != 0){

            System.out.println("\n\n\n\n\n\n\n\n");

            System.out.println("COMPANIE DE TRANSPORT");
            System.out.println("");
            System.out.println("1. Afiseaza angajatii dupa nume");
            System.out.println("2. Afiseaza angajatii dupa CNP");
            System.out.println("3. Afiseaza orase");
            System.out.println("4. Afiseaza automobile");
            System.out.println("5. Afiseaza depozite");
            System.out.println("6. Afiseaza cursele programate");
            System.out.println("7. Afiseaza rutele");
            System.out.println("8. Adaugare angajat");
            System.out.println("9. Adaugare oras");
            System.out.println("10. Adaugare ruta");
            System.out.println("11. Programeaza o cursa");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.println("Alegere: ");

            alegere = sc.nextInt();
            sc.nextLine();

            switch(alegere){
                case 1:{
                    serviciu.afisareAngajatiSortNume();
                    serviciu.audit("afisareAngajatiSortNume");
                }break;
                case 2:{
                    serviciu.afisareAngajatiSortCNP();
                    serviciu.audit("afisareAngajatiSortCNP");
                }break;
                case 3:{
                    serviciu.afisareOrase();
                    serviciu.audit("afisareOrase");
                }break;
                case 4:{
                    serviciu.afisareAutomobile();
                    serviciu.audit("afisareAutomobile");
                }break;
                case 5:{
                    serviciu.afisareDepozite();
                    serviciu.audit("afisareDepozite");
                }break;
                case 6:{
                    serviciu.afisareCurse();
                    serviciu.audit("afisareCurse");
                }break;
                case 7:{
                    serviciu.afisareRute();
                    serviciu.audit("afisareRute");
                }break;
                case 8:{
                    serviciu.adaugareSofer();
                    serviciu.scrieAngajatCSV();
                    serviciu.audit("adaugareSofer");
                }break;
                case 9:{
                    serviciu.adaugareOras();
                    serviciu.scrieOrasCSV();
                    serviciu.audit("adaugareOras");
                }break;
                case 10:{
                    serviciu.adaugareRuta();
                    serviciu.scrieRuteCSV();
                    serviciu.audit("adaugareRuta");
                }break;
                case 11:{
                    serviciu.adaugareCursa();
                    serviciu.audit("adaugareCursa");
                }break;
                case 12:{
                    serviciu.adaugareAutomobil();
                    serviciu.scrieAutomobilCSV();
                    serviciu.audit("adaugareAutomobil");
                }break;
                case 0:{break;}
                default:{
                    System.out.println("Alegere inexistenta!");
                }
            }
        }
    }
}
