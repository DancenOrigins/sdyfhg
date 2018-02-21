package pnt_pkg;

import java.util.Scanner;

public class Wrongtangle {
		
	public static void main(String[] args) {
			
		int i = 0;
		
		for (i=1;i <= 3;i++){
			
			System.out.println("what suit did you draw?");
			Scanner scanner = new Scanner (System.in);
			int LenthScn = scanner.nextInt();
			System.out.println("what number did you draw?");
			int WithScn =scanner.nextInt();
			
			Rekt_angle fo = new Rekt_angle(LenthScn ,WithScn);
			
			System.out.println(fo.Addition(WithScn, LenthScn));
			
			scanner.close();
		}
		
	}

}
