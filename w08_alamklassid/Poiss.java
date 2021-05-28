public class Poiss extends Inimesed{
    public Poiss(String nimi, String perenimi, int vanus){
        super(nimi,perenimi,vanus);
        //this.tegevus="kõndimisega";
    }
    @Override
    public void Vanus(){
        System.out.println("Poisi vanus on " + vanus);
    }
}