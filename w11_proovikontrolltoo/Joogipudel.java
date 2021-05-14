import java.util.Scanner; 


public class Joogipudel
{
    public static void main(String s[])
    {
        Pudel pudel = new Pudel();
        pudel.pudeliNimi = "Sprite";
        pudel.suurus = 500.0;
        float suurusLiiter = (float)pudel.suurus / 1000;
        pudel.onJook = false;

      /*  boolean onJooki = pudel.täidaJook();
        onJooki = true;
        pudel.muudaJooki(onJooki); */

        pudel.mass = 20;
        pudel.taara = 0.1;
        float taara = (float)pudel.taara;

        Jook jook = new Jook();
        jook.joogiNimi = "Sprite";
        jook.liitrihind = 2;
        jook.kaal = 1;
            
        System.out.print(jook.joogiNimi + " liitrihind on " + jook.liitrihind + " eurot ja liitri kaal on " + jook.kaal + "kg");
        System.out.print("");
        System.out.print(pudel.pudeliNimi + " pudeli suurus on " + pudel.suurus + " ml");
        System.out.println(pudel.onJook ? " Pudel on hetkel täis " : " Pudel on hetkel tühi ");
        float koguhind =  taara+(suurusLiiter*jook.liitrihind);
        System.out.println("pudel "+ jook.joogiNimi+" maksab " + koguhind + " eurot");

      /*  Scanner scan = new Scanner(System.in);
        String täidaJook = scan.nextLine();
        boolean onJooki = pudel.täidaJook();
        if(täidaJook.equals("täida")){
            onJooki = true;
        } else if (täidaJook.equals("tühjenda"));{
            onJooki = false;
        }
        pudel.muudaJooki(onJooki);
        scan.close();*/
    }
    


static class Jook{
        public String joogiNimi;
        public float liitrihind;
        public float kaal;
}

static class Pudel{
    public boolean onJook;
    public String pudeliNimi;
    public float numberOfSims;
    public double suurus;
    public float mass;
    public double taara;
    public float suurusLiiter;
}
}