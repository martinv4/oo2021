public class kodune{
	public static int nädalad(int nädal) {
		String progress = "";
		if(nädal >= 14) {progress = "semester läbi";}
		if(progress == "semester läbi") {return 0;} else {return 14 - nädal;}
	}
	public static void main(String[] arg) {
		int nädal = (nädalad(Integer.parseInt(arg[0])));
		String progress = "";
		if(nädal == 0) {progress = "semester on läbi";} else {progress = "semestris on veel "+nädal+" nädalat";}
		
		System.out.println(progress);
	}
}
