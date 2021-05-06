
public class Pakk {
    String pakiNimi;
    int pakkideArv;
    Isik inimene;
    public Pakk(String nimi, int pakid) {
        pakiNimi = nimi;
        pakkideArv = pakid;
    }
    public void pakkideArvuMuutus(int arv) {
        pakkideArv += arv;
    }
    public int pakkeHetkel() {
        return pakkideArv;
    }
    public void UusIsik(String nimi, int summa) {
        inimene = new Isik(nimi, summa, pakiNimi);
    }
    public String toString() {
        return inimene.toString();
    }
}
