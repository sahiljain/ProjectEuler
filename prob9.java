import java.util.ArrayList;


public class prob9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] perfectsquares = new int[1000];
			ArrayList<Integer> perfsquares = new ArrayList<Integer>();
			for(int i = 0;i<perfectsquares.length;i++){
				perfectsquares[i] = (int) Math.pow(i, 2);
				perfsquares.add(perfectsquares[i]);
			}
			
			for(int i = 0;i<perfectsquares.length;i++){
				int curC = i;
				for(int j = 0;j<perfectsquares.length;j++){
					int curA = j;
					int remaining = 1000 - i-j;
					if(Math.pow(remaining, 2) + perfectsquares[j]==perfectsquares[i] ){
						System.out.println((i+" "));
						System.out.println((j+" "));
						System.out.println(remaining+" ");
					}
				}
			}
			
			
	}

}
