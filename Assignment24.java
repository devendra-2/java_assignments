package basicprograms;

public class Assignment24 {
	public static void main(String[] args)
	{
		for (int i=1;i<365;i++) {
			if (i>0 && i<32) {
				System.out.println("january");
				if (i==31) {
					i=0;
				}
			}
			else if (i>=32 && i<62) {
				System.out.println("feb");
			}
			else if (i>=62 && i<92) {
				System.out.println("march");
			}
			else if (i>=92 && i<122) {
				System.out.println("april");
			}
			else if (i>=122 && i<152) {
				System.out.println("may");				
		}
			else if (i>=152 && i<182) {
				System.out.println("june");
				break;
				}
			
		}

	}

		}
