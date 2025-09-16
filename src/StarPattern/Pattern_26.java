package StarPattern;

public class Pattern_26 {
	
	public static void main(String[] args) {
		
//		 *     *     * 
//		    *     *    
//		 *     *     * 
//		    *     *    
//		 *     *     * 
//		    *     *    
//		 *     *     * 
	
		int rows = 7;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Create a staggered effect by adding spaces
                if ((i + j) % 2 == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
	}

}
