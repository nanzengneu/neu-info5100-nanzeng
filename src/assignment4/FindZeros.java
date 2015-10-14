package assignment4;

import java.util.ArrayList;

public class FindZeros {

	
	public static void main(String [] args){
		int[] input={1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0};
		ArrayList<Integer> position = new ArrayList<Integer>();
		
		for (int i=0; i<input.length; i++){
			if (input[i] == 1) {
				position.add(i);
			}
		} 
		
		if (position.get(0)>=2) {
		   for (int k =0; k < position.get(0); k++) {
			   System.out.print("0");
		   }
		   System.out.println("@ index 0");
		}
		
		
		for (int j=0; j<position.size()-1; j++){
			if((position.get(j+1)-position.get(j))>2){
				int gap = position.get(j+1)-(position.get(j)+1);
				
				for (int k = 0; k<gap;k++){
					System.out.print("0");
				}
				System.out.println(" @ Index "+ (position.get(j)+1));
			}
		
		}
		
		if ((input.length-1 )- position.get(position.size()-1) >=2) {
			int diff = (input.length-1 )- position.get(position.size()-1);
			   for (int k =0; k < diff; k++) {
				   System.out.print("0");
			   }
			   System.out.println(" @ index " + (position.get(position.size()-1)+1));
			}
	
		
	}

}
