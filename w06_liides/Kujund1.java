
//RISTKÜLIK
public class Kujund1 implements TestInterface {
    public double Pindala(double[] andmed) {
            double pindala;
            double külgA= andmed[0];
            double külgB= andmed[1];
            pindala = külgA*külgB;
            return pindala;
        }

    public double Umbermoot(double[] andmed) {
        // TODO Auto-generated method stub
        //return 0;
        double umbermoot;
        double külgA = andmed[0];
        double külgB = andmed[1];
        umbermoot = 2*(külgA+külgB);
        return umbermoot;
    }
}