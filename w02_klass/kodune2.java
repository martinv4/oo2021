
public class kodune2 {
    public static void main(String[] arg) {
        calculations arvutus = new calculations();
        calculations.Pindala pindala = arvutus.new Pindala();
        calculations.Umbermoot umbermoot = arvutus.new Umbermoot();

        System.out.println("ringi pindala on " + pindala.ring(4) + " ruutühikut");
        System.out.println("ristküliku ümbermõõt on "  + umbermoot.ristkulik(20, 30) + " ühikut");
        System.out.println("ruudu pindala on " + pindala.ruut(4) + " ruutühikut");
        System.out.println("kolmnurga ümbermõõt on " + umbermoot.kolmnurk(2) + " ühikut");
    }
}
