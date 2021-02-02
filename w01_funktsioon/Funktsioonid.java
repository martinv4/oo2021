public class Funktsioonid{
	public static double taksosoit(double s){
		return 3+(0.8*s);
		
	}
	public static String temperatuuriHinnang(int t){
		if(t<18){return "külm";}
		return "soe";
	}
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
	public static void main(String[] arg) {
		System.out.println(taksosoit(Integer.parseInt(arg[0])));
		System.out.println(ringiPindala(5));
		if(arg.length==1){
			System.out.println(temperatuuriHinnang(Integer.parseInt(arg[1])));
		}
	}
}