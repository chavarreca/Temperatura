import java.awt.*;
import java.util.Scanner;

public class grados{
	
	public static void main(String[] arg){
		Scanner skarner = new Scanner(System.in);
		float cent, kelv;
	
		
		System.out.println("Introduzca Grados Celcius: ");
		String aux = skarner.nextLine();
		
		cent = Float.parseFloat(aux);
		kelv = 273.15f+cent;
		aux = String.valueOf(kelv) + " K";
		System.out.println(aux);
	
	}
}