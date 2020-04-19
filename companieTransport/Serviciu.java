package companieTransport;

import java.util.*;


public class Serviciu {

    Scanner sc = new Scanner(System.in);

    protected List<Angajat> angajati = new ArrayList<>();
    protected TreeSet<Oras> orase = new TreeSet<>();
    protected List<Automobil> automobile = new ArrayList<>();
    protected List<Cursa> curse = new ArrayList<>();
    protected List<Depozit> depozite = new ArrayList<>();
    protected Set<Ruta> rute = new HashSet<>();

//    private void umplereOrase(){
//        Oras a = new Oras("Bucuresti", 8);
//        Oras b = new Oras("Cluj", 4);
//        orase.add(a);
//        orase.add(b);
//    }
    public void hardDepozite(){
        Depozit depo = new Depozit(orase.first(),"Coconasul nr.3",automobile.size(),automobile.toArray(new Automobil[automobile.size()]));
        depozite.add(depo);
    }
    public void hardCurse(){
        Iterator<Ruta> iterator = rute.iterator();
        Ruta rut = iterator.next();
        Cursa cursa = new Cursa(rut,automobile.toArray(new Automobil[automobile.size()])[0],
                                angajati.toArray(new Angajat[angajati.size()])[0],"12-10-2020","11:30");
        curse.add(cursa);
    }

    protected void afisareRute(){
        for(Ruta ruta : rute){
            System.out.println(ruta.getOrasPlecare()+"-->"+ruta.getOrasDestinatie()+" - "+ruta.getNumarKilometri()+" kilometri");
        }
    }
    protected void afisareAngajatiSortNume(){
        ComparatorAngajatiNume cmp = new ComparatorAngajatiNume();
        angajati.sort(cmp);
        for(Angajat angajat : angajati){
            if(angajat instanceof Soferi) {
                System.out.println(angajat.getNume() + "  " + angajat.getPrenume() + "  " + angajat.getCNP()+" ->Sofer si detine permis: "+((Soferi) angajat).getPermis());
            }
            else{
                System.out.println(angajat.getNume() + "  " + angajat.getPrenume() + "  " + angajat.getCNP());
            }
//            System.out.println(angajat.getPrenume());
//            System.out.println(angajat.getPrenume());
        }
    }
    protected void afisareAngajatiSortCNP() {
        Collections.sort(angajati);
        for (Angajat angajat : angajati) {
            System.out.println(angajat.getNume() + "  " + angajat.getPrenume() + "  " + angajat.getCNP());
        }
    }
    protected void afisareAutomobile(){
        for(Automobil automobil : automobile){
            System.out.println(automobil.getNrInmatriculare()+" "+automobil.getNrLocuri()+" locuri");
        }
    }
    protected void afisareDepozite(){
        for(Depozit depozit : depozite){
            System.out.println(depozit.getOras().getNumeOras()+" "+depozit.getStrada());
            for(Automobil auto : depozit.getAutomobile()){
                System.out.println(auto.getNrInmatriculare()+"--"+auto.getNrLocuri());
            }
            System.out.println("");
        }
    }
    protected void afisareOrase(){
        //umplereOrase();
        for(Oras oras : orase){
            System.out.println(oras.getNumeOras() +"   "+oras.getNumarStatii());
        }
    }
    protected void adaugareSofer(){
        System.out.println("Nume:");
        String nume = sc.nextLine();
        System.out.println("Prenume:");
        String prenume = sc.nextLine();
        System.out.println("CNP:");
        String cnp = sc.nextLine();
        System.out.println("Este sofer?  0/1");
        Integer ifSofer = sc.nextInt();
        if(ifSofer == 1){
            System.out.println("Ce permis detine");
            sc.nextLine();
            String permis = sc.nextLine();


            Angajat sofer = new Soferi(nume,prenume,cnp,permis);
            sofer.setIfSofer(1);
            angajati.add(sofer);
        }
        else {
            Angajat angajat = new Angajat(nume,prenume,cnp);
            angajati.add(angajat);
        }
        sc.nextLine();

    }
    protected void afisareCurse(){
        for(Cursa cursa : curse){
            System.out.println(cursa.getRuta().getOrasPlecare()+" "+cursa.getRuta().getOrasDestinatie()+" "+cursa.getData());
        }
    }
    protected void adaugareOras(){
        System.out.println("Numele orasului:");
        String nume = sc.nextLine();
        System.out.println("Numar statii:");
        Integer numar = sc.nextInt();
        orase.add(new Oras(nume, numar));

        sc.nextLine();
    }
    protected void adaugareRuta(){
        System.out.println("Numele orasului plecare:");
        String nume1 = sc.nextLine();
        System.out.println("Numele orasului destinatie:");
        String nume2 = sc.nextLine();
        System.out.println("Numar kilometri:");
        Integer numar1 = sc.nextInt();
        System.out.println("Numar minute:");
        Integer numar2 = sc.nextInt();

        sc.nextLine();

        rute.add(new Ruta(nume1, nume2, numar1, numar2));
    }
    protected  void adaugareAutomobil(){
        System.out.println("Nr imtatriculare: ");
        String nr = sc.nextLine();
        System.out.println("Nr locuri:");
        Integer nrLoc = sc.nextInt();
        System.out.println("Este functional?  true/false");
        Boolean bol = sc.nextBoolean();

        sc.nextLine();

        automobile.add(new Automobil(nr,nrLoc,bol));
    }

    protected void adaugareCursa(){

    }
    protected void stergereCursa(){

    }

}
