package assignment5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Assignment5 {
	
	public static int singleNumber(int[] nums){
		int nonDuplicatedNumber = nums[0];
		for(int i = 1; i < nums.length; i++){
			nonDuplicatedNumber = nonDuplicatedNumber ^ nums[i];
		}
		return nonDuplicatedNumber;
	}
	
	public static boolean wordPattern(String pattern, String str){
		if(pattern == null && str == null){
			return true;
		}
		if(pattern == null || str == null){
			return false;
		}
		
		char[] chars = pattern.toCharArray();
		String[] tokens = str.split(" ");
		if(tokens.length != chars.length){
			return false;
		}
		
		HashMap<Character, String> map = new HashMap<Character, String>();
		HashSet<String> tokenSet = new HashSet<String>();
		
		for(int i = 0; i < chars.length; i++){
			if(map.containsKey(chars[i]) && map.get(chars[i]).equals(tokens[i])){
				continue;
			} else if (!map.containsKey(chars[i]) && !tokenSet.contains(tokens[i])){
				map.put(chars[i], tokens[i]);
				tokenSet.add(tokens[i]);
			} else {
				return false;
			}
		}
		return true;		
	}
	
	public static boolean isValid(String s){
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if(map.keySet().contains(a)) {
				stack.push(a);
			} else if (map.values().contains(a)) {
				if (!stack.empty() && map.get(stack.peek()) == a) {
					stack.pop();
				}else{
					return false;
				}
			}
		}
		return stack.empty();
	}
	
	
	public static void main (String[] args){
		int[] list1 = {2, 3, 4, 5, 6, 3, 4, 5, 6};
		System.out.println(singleNumber(list1));
		String pattern = "abba";
		String str1 = "dog cat cat dog";
		String str2 = "dog fish cat fish";
		System.out.println(wordPattern(pattern, str1));
		System.out.println(wordPattern(pattern, str2));
		String s1 = "()[]{}";
		String s2 = "(]";
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
	}
}
