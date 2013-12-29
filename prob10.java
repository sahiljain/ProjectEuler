
public class prob10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long total = 2;
		int curPrime = 2;
		
		for(int i = 1;i<2000000;i++){
			curPrime = findNextPrime(curPrime);
			total+= curPrime;
			if(i%1000==0)
			System.out.println(i + "\t "+ total);
		}
		System.out.print(total + " ");
	}
	
	private static int findNextPrime(int in) {
		// TODO Auto-generated method stub
		in++;
		while(!isPrime(in)){
		//	System.out.println(in + "");
			in++;
		}
		//System.out.println(in + "");
		return in;
	}
	
	private static boolean isPrime(double in){
		for(double i = 2;i<in;i++){
			if(Math.floor(in/i)==Math.ceil(in/i)){
				//System.out.println(in + " " + i + " "+ in/i + "");
				return false;
			}
		}
		return true;
	}

}
