package companieTransport;

import java.io.*;
import java.sql.Timestamp;

public class Serviciu_IO extends Serviciu {

    private static Serviciu_IO single_instance = null;
    private Serviciu_IO() {
    }
    public static Serviciu_IO getInstance(){
        if(single_instance == null){
            single_instance = new Serviciu_IO();
        }
        return single_instance;
    }


    public void citesteOraseCSV(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("orase.txt"))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                if(currentLine.compareTo("") == 0){return;}
                String[] dataFields = currentLine.split(",");
                Oras oras = new Oras(dataFields[0], Integer.parseInt(dataFields[1]));
                orase.add(oras);

            }
        } catch (IOException e) {
            System.out.println("Could not read data from file: " + e.getMessage());
            return;
        }
        System.out.println("Am citit cu succes " + orase.size() + " orase!");
    }

    public void citesteAngajatiCSV(){
        angajati.clear();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("angajati.txt"))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                if(currentLine.compareTo("") == 0) return;
                String[] dataFields = currentLine.split(",");
                if(Integer.parseInt(dataFields[3]) == 1){
                    Soferi obiect = new Soferi(dataFields[0],dataFields[1],dataFields[2],dataFields[4]);
                    obiect.setIfSofer(1);
                    angajati.add(obiect);
                }
                else {
                    Angajat obiect = new Angajat(dataFields[0], dataFields[1], dataFields[2]);
                    angajati.add(obiect);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read data from file: " + e.getMessage());
            return;
        }
        System.out.println("Am citit cu succes " + angajati.size() + " angajati!");
    }

    public void citesteAutomobilCSV(){
        automobile.clear();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("automobile.txt"))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null ) {
                if(currentLine.compareTo("") == 0) {return;}
                String[] dataFields = currentLine.split(",");

//                System.out.println(dataFields[0]);
//                System.out.println(dataFields[1]);
//                System.out.println(dataFields[2]);

                Automobil obiect = new Automobil(dataFields[0], Integer.parseInt(dataFields[1]),Boolean.parseBoolean(dataFields[2]));
                automobile.add(obiect);
            }
        } catch (IOException e) {
            System.out.println("Could not read data from file: " + e.getMessage());
            return;
        }
        System.out.println("Am citit cu succes " + automobile.size() + " automobile!");
    }

    public void citesteRuteCSV(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("rute.txt"))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                if(currentLine.compareTo("") == 0) return;
                String[] dataFields = currentLine.split(",");
                Ruta obiect = new Ruta(dataFields[0], dataFields[1], Integer.parseInt(dataFields[2]), Integer.parseInt(dataFields[3]));
                rute.add(obiect);
            }
        } catch (IOException e) {
            System.out.println("Could not read data from file: " + e.getMessage());
            return;
        }
        System.out.println("Am citit cu succes " + rute.size() + " rute!");
    }


    public void scrieOrasCSV() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("orase.txt"))) {
            for (Oras obiect : orase) {
                bufferedWriter.write(obiect.getNumeOras() + "," + obiect.getNumarStatii());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Could not write data to file: " + e.getMessage());
            return;
        }
        System.out.println("Successfully wrote " + orase.size() + " orase!");
    }

    public void scrieAngajatCSV() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("angajati.txt"))) {
            for (Angajat obiect : angajati) {
                if(obiect instanceof Soferi){
                    bufferedWriter.write(obiect.getNume() + "," + obiect.getPrenume()+","+obiect.getCNP()+","+obiect.getIfSofer()+","+((Soferi) obiect).getPermis());
                }
                else {
                    bufferedWriter.write(obiect.getNume() + "," + obiect.getPrenume() + "," + obiect.getCNP()+","+obiect.getIfSofer());
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Could not write data to file: " + e.getMessage());
            return;
        }
        System.out.println("Successfully wrote " + angajati.size() + " angajati!");
    }

    public void scrieAutomobilCSV() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("automobile.txt"))) {
            for (Automobil obiect : automobile) {
                bufferedWriter.write(obiect.getNrInmatriculare() + "," + obiect.getNrLocuri()+","+obiect.getFunctional());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Could not write data to file: " + e.getMessage());
            return;
        }
        System.out.println("Successfully wrote " + automobile.size() + " automobile!");
    }

    public void scrieRuteCSV() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("rute.txt"))) {
            for (Ruta obiect : rute) {
                bufferedWriter.write(obiect.getOrasPlecare() + "," + obiect.getOrasDestinatie()+","
                                        +obiect.getNumarKilometri()+","+obiect.getNumarMinute());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Could not write data to file: " + e.getMessage());
            return;
        }
        System.out.println("Successfully wrote " + automobile.size() + " automobile!");
    }


    public void audit(String s){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        try {
            FileWriter fileWritter = new FileWriter(new File("audit.txt"),true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWritter);
            bufferedWriter.newLine();
            bufferedWriter.write(s+","+timestamp);
            bufferedWriter.close();
            fileWritter.close();

            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
