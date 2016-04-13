//Session 5 - Assignment 3

package bdd;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class String_demo {
	
	private static int countWord(String word, ArrayList<String> al) {
		int wordCount = 0;
		for (int i = 0; i < al.size(); i++) {
			int isWord = al.get(i).indexOf(word);
			if (isWord >= 0)
				wordCount++;
		}		
		return wordCount;
	}
	
	private static String replaceChar(char oldChar, char newChar, String line) {
		return line.replace(oldChar, newChar);
	}
	
	private static ArrayList<String> splitLine(String splitOn, String line) {
		StringTokenizer st = new StringTokenizer(line, splitOn);
		ArrayList<String> al = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			al.add(st.nextToken());
		}
		
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line = "Hadoop is open source frame work ,Hadoop is good framework for handling big data";
		String splitLineOn = " ";	
		String word = "Hadoop";
		char oldCharToReplace = ',';
		char newCharToReplaceWith = ' ';
		
		//Split the line by space and store in a new string array
		ArrayList<String> al = splitLine(splitLineOn, line);		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//Count number of occurrence of word Hadoop in the given string 
		System.out.println("\n" + word + " is found " + countWord(word, al) + " time(s) in the line.");
		
		
		//Replace the ‘,’with space in the given string 
		String newLine = replaceChar(oldCharToReplace, newCharToReplaceWith, line);
		
		//Create a array list with generic string and store the spitted string inside it
		ArrayList<String> genStrArrList = new ArrayList<String>();
		genStrArrList.add(newLine);
		
		//Show what newLine is and what generic string array list has stored
		System.out.println("\n" + newLine + "\n");
		
		for (int i = 0; i < genStrArrList.size(); i++)
			System.out.println(genStrArrList.get(i));
	}
}


/* Output:
Hadoop
is
open
source
frame
work
,Hadoop
is
good
framework
for
handling
big
data

Hadoop is found 2 time(s) in the line.

Hadoop is open source frame work  Hadoop is good framework for handling big data

Hadoop is open source frame work  Hadoop is good framework for handling big data

*/
