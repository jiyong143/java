package DAY04;

public class StarEx5 {

	public static void main(String[] args) {
		/*           *
		 *          ***
		 *         *****
		 *        *******
		 *       *********
		 *        *******
		 *         *****
		 *          ***
		 *           *   */
		
		int i,j;
		for(i=1;i<=9;i++) {
			if(i<=5) {
				
			for(j=1;j<=5-i;j++) {
				System.out.print(' ');
			}
			
			for(j=1;j<=2*i-1;j++) {
				System.out.print(" * ");
			}
			} else {
				System.out.print(" * ");
			}
			}
			System.out.println();
		}
	}

			
			
			
	
		
		


