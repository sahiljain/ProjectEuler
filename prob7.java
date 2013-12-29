
public class prob7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prob6();
	}

	private static void prob6() {
		// TODO Auto-generated method stub
		int out=1;
		for(int i = 1;i<10002;i++){
			out = findNextPrime(out);
		}
		System.out.println(out + "");
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
