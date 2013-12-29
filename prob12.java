
public class prob12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] trianglenumbers = new int[100];
			trianglenumbers[0] = 1;
			for(int i = 1;i<trianglenumbers.length;i++){
				trianglenumbers[i] = trianglenumbers[i-1] + i + 1;
			}
			
			int[] numPrimeDivisors = new int[100];
			for(int i = 0;i<numPrimeDivisors.length;i++){
				numPrimeDivisors[i] = numberOfPrimeDivisors(trianglenumbers[i]);
				int numDivisors = (int) Math.pow(2, numPrimeDivisors[i]);
				if(numDivisors>500){
					System.out.println(trianglenumbers[i]);
					break;
				}
				
			}
			
			
			
			
			
	}

	private static int numberOfPrimeDivisors(int in) {
		int count = 0;
		int curPrime = 2;
		
		
	}

}
