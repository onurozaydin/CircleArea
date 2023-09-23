package java101;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		 double pi =3.14;
		 int r,a;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Dairenin yarıçapını giriniz : ");
		r = inp.nextInt();
		System.out.println("Merkez Açısını Giriniz : ");
		a = inp.nextInt();
		
		double area = pi * r * r;
		double env =  2 * pi * r;
		double daireDilimi = (pi * (r * r) * a) / 360;
		
		 System.out.println("Dairenizin Alanı : " + area);
	     System.out.println("Dairenizin Çevresi : " + env);
	     System.out.println("Dairenizin Dilimi Alanı : " + daireDilimi);
		

	}

}
