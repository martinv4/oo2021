public class Main {
    public static void main(String[] arg) {
        Pakk pakk1 = new Pakk("Piimapakk", 400);
        Pakk pakk2 = new Pakk("Mahlapakk", 200);
        System.out.println("Piimapakke oli poes " + pakk1.pakkeHetkel());
        System.out.println("Mahlapakke oli poes " + pakk2.pakkeHetkel());
        System.out.println("");
        pakk1.pakkideArvuMuutus(-50);
        pakk2.pakkideArvuMuutus(50);
        System.out.println("Piimapakke on nüüd poes " + pakk1.pakkeHetkel());
        System.out.println("Mahlapakke on nüüd poes " + pakk2.pakkeHetkel());
        System.out.println("");
        pakk1.UusIsik("Peeter Piim", 2);
        pakk2.UusIsik("Mihkel Mahl", 4);
        System.out.println(pakk1.toString());
        pakk1.inimene.KontoJaagiMuutus(20,0);
        System.out.println("Peeter ostis " + " piima juurde"); //ideaalis võiks näidata mitu juurde ostis
        System.out.println(pakk1.toString());
        System.out.println("");
        System.out.println(pakk2.toString());
        pakk2.inimene.KontoJaagiMuutus(14,0);
        System.out.println("Mihkel ostis " + JuurdeOst.arv + " mahla juurde"); //ideaalis võiks näidata mitu juurde ostis
        System.out.println(pakk2.toString());
    }
}
