package c;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		
		//first stored a string in the variable sentence
		//2nd setup a scanner called megaScan to scan the variable sentence
		//3rd setup a data structure called and ArrayList for strings and called it words
		//4th setup a while loop that scans sentence to see if it has another word to loop
		
		String sentence = "flapjacks are awesome!";
		
		Scanner megaScan = new Scanner(sentence);
		
		ArrayList<String> words = new ArrayList<String>();
		
		while(megaScan.hasNext()) {
			words.add(megaScan.next());
		}
		
		System.out.println(words);
		
	}

}
