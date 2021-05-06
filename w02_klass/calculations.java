import java.lang.Math;

public class calculations {
    public class Pindala {
        public double ring(double raadius) {
            double pindala;
            pindala = Math.PI * Math.pow(raadius, 2);
            return pindala;
        }
        public double ruut(double kylg) {
            double pindala;
            pindala = Math.pow(kylg, 2);
            return pindala;
        }

        }
     
    public class Umbermoot {
        public double kolmnurk(double a) {
            double umbermoot;
            umbermoot = a * 3;
            return umbermoot;
        }
        public double ristkulik(double a, double b) {
            double umbermoot;
            umbermoot = 2*(a + b);
            return umbermoot;
        }
    } 
}
