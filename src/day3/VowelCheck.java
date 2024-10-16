package day3;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(containsVowel(str)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}
	
	public static boolean containsVowel(String s) {
		
		for(int i =0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			if(isVowel(c)) {
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean isVowel(char c) {
		
		 c = Character.toLowerCase(c);
		 
		 return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u';
		
	}

}
