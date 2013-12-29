
public class prob5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			prob5();
	}

	private static void prob5() {
		// TODO Auto-generated method stub
		int total = 0;
		int totalsquares = 0;
		for(int i = 1;i<101;i++){
			System.out.println(""+ Math.pow(i,2));
			total+=i;
			totalsquares+= Math.pow(i,2);
		}
		long totalsumsquared = (long) Math.pow(total, 2);
		System.out.println(totalsumsquared+"");
		System.out.println(totalsquares+"");
	}

}
