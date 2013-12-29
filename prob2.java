import java.util.ArrayList;


public class prob2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int curNum = 0;
			int count = 0;
			ArrayList<Integer> fibseq = new ArrayList<Integer>();
			fibseq.add(1);
			fibseq.add(2);
			for(int i = 2;i<4000000;i++){
				fibseq.add(fibseq.get(i-2) + fibseq.get(i-1));
				if(fibseq.get(fibseq.size()-1)>4000000) break;
			}
			for(int x : fibseq){
				if(x%2 == 0){
					count+= x;
				}
			}
			System.out.println(count);
	}

}