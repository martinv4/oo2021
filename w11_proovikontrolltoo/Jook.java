public class Jook{
    public static void main(String s[])
    {
        Jook jook = new Jook();
        jook.joogiNimi = "Sprite";
        jook.liitrihind = 4;
        jook.kaal = 15;
        
        System.out.print(jook.joogiNimi + " liitrihind on " + jook.liitrihind + " eurot ja liitri kaal on " + jook.kaal + "kg");

    }
    public String joogiNimi;
    public int liitrihind;
    public int kaal;
}
