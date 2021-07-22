package problem222;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {

	private static int countNumberOfWords(String st) {  // THE KING THH
		int count = 0;

		for (int i = 0; i < st.length(); i++) {

			if(i==0 ||st.charAt(i-1) == ' ') {
				count++;
			}

		}
		
		return count;

	}

	private static String reverse(String st,int num) {
		// char[] ch=new char[st.length()];
		int j = 0;
		String[] str = new String[num];

		for (int i = 0; i < st.length(); i++) {
			String s = "";
			while (i < st.length() && st.charAt(i) != ' ') { //  THE KING
				s = s + st.charAt(i);
				i++;
			}
			str[j] = s;
			j++;
		}
		
		

		String reversedString = "";
        //if(i==0 || i==word.length()-1)
		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			String reverseWord = "";
			for (int j1 = word.length() - 1; j1 >= 0; j1--) {
				if (word.charAt(j1) >= 'a' && word.charAt(j1) <= 'z'
						|| word.charAt(j1) >= 'A' && word.charAt(j1) <= 'Z')
					reverseWord = reverseWord + word.charAt(j1) ;
			}
			reversedString = reversedString + reverseWord + " ";
		}

		return reversedString;
	}

	private static void display(String s) {

		System.out.println("The new String is ");
		System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();

		int count=countNumberOfWords(st);
		String s = reverse(st,count);
		display(s);
		

	}

}
