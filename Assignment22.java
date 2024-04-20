package basicprograms;

import java.awt.print.Printable;

public class Assignment22 {
	public static void main(String[] args) {
		for (int i = 1; i < 501; i++) {
			System.out.println(i);
			if (i%3==0 && i%5==0) 
			{
				System.out.println("computer&mouse");
			}
			else if (i%3==0) {
				System.out.println("computer");
			}
			else if (i%5==0) {
				System.out.println("mouse");
			}
			//else{
				//System.out.println(i);
				//}
		
		
		}
	}

}