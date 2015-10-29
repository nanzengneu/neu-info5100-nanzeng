package midtermExam;

import java.util.HashSet;

import java.util.*; 


public class MidtermExam {
	
	public static String printFizzBuzz(int n){
		int number = n;
		if (number%3==0 && number%5==0) {
			return "fizz buzz";
		}else if ( number%3==0 ){
			return "fizz";
		}else if ( number%5==0 ){
			return "buzz";
		}else{
			return "";
		}
	}
 
	
	public static String moveZeroes(int[] nums){
		int index=0;
		int nonzero = 0;
		while (index <nums.length) {
		    if (nums[nonzero]==0) {
		    	while (nums[nonzero]==0 && index <nums.length ){
		    		for (int i=nonzero; i<nums.length-1; i++) {
		    			nums[i]=nums[i+1];
		    		}
		    		index++;
		    		nums[nums.length-1]=0;
		    	}
		    } else {
		    	index++;
		    }
		    nonzero++;
		    
		}
		return Arrays.toString(nums);
	}
	
	
	public static boolean isAnagram(String s, String t){
		if (s.length()!=t.length()) {
			return false;
		} else {
			for (int i=0; i<s.length(); i++){
				String letter = s.substring(i,i+1);
				int index = t.indexOf(letter);
				if (index == -1) {
					return false;
				} else{
				t = t.substring(0,index) + t.substring(index+1);
				}
			}
			return t.length()==0;
		}
	}

	
	public static boolean containsDuplicate(int[] nums){
		HashSet<Integer> numberSet1 = new HashSet<Integer>();
		if(nums==null || nums.length==0){
			return false;
		}
		for(int i:nums){
			if(numberSet1.contains(i)){
				return true;
			}
			numberSet1.add(i);
		}
		return false;
		
	}
	
	public static boolean twoSum(int[] nums, int target){
		HashSet<Integer> numberSet2 = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++){
			int firstNumber = nums[i];
		for(int j=i+1; j<nums.length; j++){
			int secondNumber = nums[j];
			int sum = firstNumber + secondNumber;
			numberSet2.add(sum);
		}
		}
		if(numberSet2.contains(target)){
			return true;
		}else{
		return false;
		}
		
	}
		
	public static void main (String[] args){
		int[] list1 = {0, 1, 0, 3, 12};
		int[] list2 = {0, 3, 7, 8, 6, 4, 3, 0, 9};
		int[] list3 = {2, 7, 11, 15};
		System.out.println(printFizzBuzz(15));
		System.out.println(moveZeroes(list1));
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("rat", "cat"));
		System.out.println(containsDuplicate(list2));
		System.out.println(twoSum(list3, 9));
		System.out.println(twoSum(list3, 10));
	}
}



