import java.math.BigInteger;
import java.util.ArrayList;


public class prob10_revised {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started");
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			for(int i = 2;i<=2000000;i++){
				numbers.add(i);
			}
			
			
			
			//start erasing the multiples
			
			for(int i = 2;i<10;i++){
				int j = 2;
				for(j = i+i;j<=10; j+=i){
					
					numbers.remove(j);
					
					
					
					
				}
				
				
				
				
			}
			System.out.println(sum( numbers.toArray()).toString());
			
	}

	private static BigInteger sum(Object[] array) {
		// TODO Auto-generated method stub
		BigInteger out = new BigInteger(0 + "");
		for(Object i : array){
			int temp = (Integer) i;
			out.add(new BigInteger(temp + ""));
		}
		return out;
	}

}
