package companieTransport;

import java.util.Comparator;

public class ComparatorAngajatiNume implements Comparator<Angajat> {

    @Override
    public int compare(Angajat a1, Angajat a2){
        int res = a1.getNume().compareTo(a2.getNume());
        if(res != 0){
            return res;
        }
        else{
            return a1.getPrenume().compareTo(a2.getPrenume());
        }
    }
}
