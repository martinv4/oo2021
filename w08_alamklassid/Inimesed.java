public class Inimesed {
    public String nimi;
    public String perenimi;
    public int vanus;

    public Inimesed(String nimi, String perenimi, int vanus){
        this.nimi=nimi;
        this.perenimi=perenimi;
        this.vanus=vanus;
    }
    public void isikInfo(){
        System.out.println("Tere, mina olen " +this.nimi+" "+this.perenimi);
    }
    public void Tegevus(String tegevus){
        System.out.println(this.nimi + " hetkel tegeleb " + tegevus);
    }
    public void Vanus(){
        System.out.println("Tema vanus on ");
    }
}
