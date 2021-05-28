public class Tüdruk extends Inimesed{
    public Tüdruk(String nimi, String perenimi, int vanus){
        super(nimi,perenimi,vanus);
    }
    @Override
    public void Vanus(){
        System.out.println("Tüdruku vanus on " + vanus);
    }
}