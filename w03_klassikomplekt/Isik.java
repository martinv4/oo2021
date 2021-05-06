public class Isik {
    int isikKogus;
    String isikuNimi;
    String pakiNimi;
    JuurdeOst juurdeOst;

    public Isik(String inimeneNimi, int algsumma, String pakkNimi) {
        isikKogus = algsumma;
        isikuNimi = inimeneNimi;
        pakiNimi = pakkNimi;
    }
    public void KontoJaagiMuutus(int arv, int i) {
        juurdeOst = new JuurdeOst(isikKogus, arv, i);
        isikKogus = juurdeOst.i();
    }
    public String toString() {
        return "Isikul " + isikuNimi + " on " + pakiNimi + "e " +  isikKogus + " tükki";
    }
}
 class JuurdeOst {
    static int summa;
    static int arv;
    public JuurdeOst(int isikKogus, int arv, int i) {
            summa = isikKogus + arv;
    }
    public int i() {
        return summa;
    }
}
