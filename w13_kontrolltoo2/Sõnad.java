import java.io.*;

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
    public static void main(String[] args) throws FileNotFoundException{
        //read file?
        File testFile = new File("testtext.txt");
        FileInputStream testFileInputStream = new FileInputStream(testFile);
        InputStreamReader testInputStream = new InputStreamReader(testFileInputStream);
        BufferedReader testReader = new BufferedReader(testInputStream);
    }
}