import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class prob11 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(new FileInputStream("prob11text.txt"));
			int [][] map = new int[20][20];
			
			for(int y = 0;y<20;y++){
				
				for(int x = 0;x<20;x++){
					map[x][y] = s.nextInt();
				//	System.out.print(map[x][y] + "\t");
				}
				//System.out.println();
			}
			
			
			//measure the maxes
			
			int curMax = 0;
			
			//calculate horiz max
			for(int y = 0;y<20;y++){
				for(int x = 0; x<17;x++){
					int curProd = map[x][y] * map[x+1][y] * map[x+2][y] * map[x+3][y];
					curMax = Math.max(curMax, curProd);
				}	
				
			}
			
			//calculate vertical max
			
			for(int y = 0;y<17;y++){
				for(int x = 0;x<20;x++){
					
					int curProd = map[x][y] * map[x][y+1] * map[x][y+2] * map[x][y+3];
					curMax = Math.max(curMax, curProd);
					
				}
				
				
			}
			
			//calculate NW/SE diagonal max
			
			for(int y = 0;y < 17;y++){
				for(int x = 0;x<17;x++){
					
					int curProd = map[x][y] * map[x+1][y+1] * map[x+2][y+2] * map[x+3][y+3];
					curMax = Math.max(curMax, curProd);
					
				}
				
				
				
			}
			
			for(int y = 0;y < 17;y++){
				for(int x = 3;x<20;x++){
					
					int curProd = map[x][y] * map[x-1][y+1] * map[x-2][y+2] * map[x-3][y+3];
					curMax = Math.max(curMax, curProd);
					
				}
				
				
				
			}
			
			System.out.println(curMax);
			
	}

}
