import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.BufferedReader;
import java.io.FileReader;

//sõnapikkuste uuring
//Salvesta uurimiseks vähemalt paarileheküljeline tekst.
//* Koosta programm, mis loeks kokku, mitu kolmetähelist sõna on tekstis.

//* Koosta graafik, kus ühel teljel on teksti algusest sinnamaani esinenud 
//kolmetäheliste sõnade arv ning teisel teljel selleks ajaks leitud 
//kolmetäheliste erinevate sõnade arv.

//* Võta uuringuks tunduvalt pikem tekst. Kuva joonisele sarnased 
//graafikud 1-10 tähe pikkuste sõnade kohta. Mummukestega tähista
//joonistele kohad, kus on läbitud veerand, pool ja kolmveerand tekstist.

// Java program to count the 
// number of charaters in a file

  
public class Sõnad {
    //teema valitud esialgu :)
    public static void main(String[] args) throws IOException{
        //read file?
        //File testFile = new File("testtext.txt");
        //FileInputStream testFileInputStream = new FileInputStream(testFile);
        //InputStreamReader testInputStream = new InputStreamReader(testFileInputStream);
        //BufferedReader testReader = new BufferedReader(testInputStream);
        Sõnad testing = new Sõnad();
        testing.SõnadeArv();
    }

        
    
    public int sõnadeArv = 0;
    String text;
        
    public void SõnadeArv() throws IOException {
            File testFile = new File("testtext3.txt");
            FileInputStream testFileInputStream = new FileInputStream(testFile);
            InputStreamReader testInputStream = new InputStreamReader(testFileInputStream);
            BufferedReader testReader = new BufferedReader(testInputStream);
                

        while((text = testReader.readLine()) != null){

        
            String[] kõikSõnad = text.split(" ");;
            for(String sõnad : kõikSõnad){

                if(sõnad.length()==3){
                    sõnadeArv = sõnadeArv +1;
                    System.out.println(Arrays.asList(sõnad));
                    //System.out.println("test/esines sõna");
                    
                } else {
                    
                }
                //String kõikSõnad = Arrays.toString();
                //System.out.println(sõnad.length());
                //System.out.println(sõnad3);

            }
        }
        if( sõnadeArv == 0){
            System.out.println("3tähelisi sõnu ei olnud");
        }
        
        
        System.out.println("tekstis oli 3tähelisi sõnu kokku: " + sõnadeArv);
    }
}

 