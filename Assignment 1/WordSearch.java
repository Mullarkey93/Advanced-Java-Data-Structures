
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * A class which takes in a file, searches for a word in said file and then returns all instances 
 * where the selected word appears in the selected file, including the word before and after each
 * instance of the collected word
 * 
 * @author Michael Mullarkey (16204743)
 *
 */
public class WordSearch {
	
	private ArrayList<String> list = new ArrayList<String>();
	private String result;
	
	/**
	 * Main to initiate program
	 * @param args
	 */
	public static void main(String[] args) {
		WordSearch wordSearch = new WordSearch(); 
		wordSearch.getFileAndWord();
	}
	
	/**
	 * Method which gets user input for the file and word to wish to look for
	 */
	private void getFileAndWord(){
		
		String fileName = JOptionPane.showInputDialog(null, "Enter file name:", "myNovel.txt");
		
		String word = JOptionPane.showInputDialog(null, "Which word you want to search for?", "I");
		
		//variable 'result' to hold the result returned from the searchFile method
		result = searchFile(fileName, word);
		
		if (result.length() <= 0) {
			result = "Word does not exist in: " + fileName;
		}
		
		JOptionPane.showMessageDialog(null, result);
		System.exit(0);
	}
	
	/**
	 * Method which searches the file for the given word and returns every instance of this word 
	 * in said file
	 * @param fileName the users chosen file
	 * @param word the users chosen word
	 * @return String of the evaluation 
	 */
	private String searchFile(String fileName, String word){

		StringBuilder sb = new StringBuilder();
		
		try {
			FileReader file = new FileReader(fileName);
			
			//scan file
			Scanner scan = new Scanner(file);
			
			//put each word from the file into an ArrayList
			while (scan.hasNextLine()) {
                String line = scan.next();
                list.add(line);
            }
			
            scan.close();
            
		} catch (FileNotFoundException e) {
			return("File not found");
		}
		
		int count = 0;
		for (String currentWord : list) {
			if(word.equals(currentWord)){
				// get the matches between the users chosen and word currently in the loop, 
				//and then get the word before and after that word
				//(if at the beginning or end of array, then print null, to avoid out of index error)
				sb.append((count-1 < 0 ? "null" : list.get(count-1)) + " " + currentWord + " " + ((count+1) > (list.size() - 1) ? "null" : list.get(count+1)) + "\n");
			}
			count++;
		}
		return sb.toString();
	}
}
