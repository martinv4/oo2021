//Trips-traps-trull

//* Joonista sümbolite abil ekraanile trips-traps-trulli ruudustik
//* Kasutaja teatab rea ja veeru. Vastavasse kohta märgitakse kordamööda x ja 0
//* Kontrollitakse käikude õigsust, teatatakse mängu lõpust. 
import java.util.*;
public class tripstrapstrull {
public static void main(String args[]) {
    
    Scanner in = new Scanner(System.in);
    String[][] grid = {{"   ", "   ", "   "}, 
                        {"   ", "   ", "   "},
                        {"   ", "   ", "   "}};
    while(true) {
        //käik 1
        Scanner player1input = new Scanner(askInput(in, grid, 1));
        grid[player1input.nextInt() - 1][player1input.nextInt() - 1] = " X ";
        player1input.close();
        printGrid(grid);

        if(win(grid)) {
            System.out.println("mäng läbi, võitis mängija nr 1 (X)!");
            break;
        }
        //käik 2
        Scanner player2input = new Scanner(askInput(in, grid, 2));
        grid[player2input.nextInt() - 1][player2input.nextInt() - 1] = " O ";
        player2input.close();
        printGrid(grid);

        if(win(grid)) {
            System.out.println("mäng läbi, võitis mängija nr 2 (O)!");
            break;
        }
    }
    in.close();
}
 //ruudustik
 public static void printGrid(String[][] grid) {
	System.out.println();
	System.out.println(grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2]);
	System.out.println("———|———|———");
	System.out.println(grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2]);
	System.out.println("———|———|———");
	System.out.println(grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2]);
	System.out.println();
 }
//win conditions jne
public static boolean win(String[][] grid) {
    //vertikaalselt
    for(int n = 0; n < grid.length; n++) {
        if((grid[n][0] == " X " && grid[n][1] == " X " && grid[n][2] == " X ") || 
		   (grid[n][0] == " O " && grid[n][1] == " O " && grid[n][2] == " O "))
			return true;
    }
    //horisontaalselt
    for(int n = 0; n < grid.length; n++) {
		if((grid[0][n] == " X " && grid[1][n] == " X " && grid[2][n] == " X ") || 
		   (grid[0][n] == " O " && grid[1][n] == " O " && grid[2][n] == " O "))
			return true;
    }
    //diagonaal
    if((grid[0][0] == " X " && grid[1][1] == " X " && grid[2][2] == " X ") || 
	   (grid[0][0] == " O " && grid[1][1] == " O " && grid[2][2] == " O "))
		return true;
    //teistpidi diagonaal
    if((grid[0][2] == " X " && grid[1][1] == " X " && grid[2][0] == " X ") || 
	   (grid[0][2] == " O " && grid[1][1] == " O " && grid[2][0] == " O "))
		return true;
    return false;
}   

public static String askInput(Scanner in, String[][] grid, int player) {
    boolean inBorders = true;
    int row = 0, column= 0;
    while(inBorders==true) {
        System.out.println("Mängija " + player + " sisesta RIDA ja VEERG (nt 2 3)");
        row=in.nextInt();
        while(true){
            if(row < 1 || row > 3) {
                System.out.println("võimatu käik");
                in.nextLine();
                row = in.nextInt();
            }   else
                break;
    }
        column=in.nextInt();
        while(true){
            if(column < 1 || column > 3) {
                System.out.println("võimatu käik");
                in.nextLine();
                column = in.nextInt();
            }   else
                break;
    }
    if (grid[row - 1][column- 1] == "   ")
        inBorders = false;
        
    if (grid[row - 1][column- 1] != "   "){
        System.out.println("sinna on juba käidud!");
        inBorders = true;
    }
 }
    return row + " " + column;
}
}
