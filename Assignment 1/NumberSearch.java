
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 * A class which takes in a file, searches for all double and Ints in said file and then return all instances 
 * where the selected a double or Int appears in the selected file, including the word before and after each
 * instance of the collected double/Int
 * 
 * @author Michael Mullarkey (16204743)
 *
 */
public class NumberSearch {
	
	private ArrayList<String> list = new ArrayList<String>();
	private String result;
	
	/**
	 * Main to initiate program
	 * @param args
	 */
	public static void main(String[] args) {
		NumberSearch numSearch = new NumberSearch();
		numSearch.getFile();
	}
	
	/**
	 * Method which gets user input for the file they wish to search
	 */
	private void getFile(){
		
		String fileName = JOptionPane.showInputDialog(null, "Enter file name:", "cakeQuestion.txt");
		
		result = searchFile(fileName);
		
		if (result.length() <= 0) {
			result = "No numbers in this file " + fileName;
		}
		
		JOptionPane.showMessageDialog(null, result);
		System.exit(0);
	}
	
	/**
	 * Method which searches the file for the all Int and doubles in the file
	 * in said file
	 * @param fileName the users chosen file
	 * @return the evaluation of all the numbers in the file
	 */
	private String searchFile(String fileName){
		
		StringBuilder sb = new StringBuilder();
		try {
			
			FileReader file = new FileReader(fileName);
			//Scan file 
			Scanner scan = new Scanner(file);
			
			//add each string/word in the file into an ArrayList
			while (scan.hasNextLine()) {
                String currentWord = scan.next();
                list.add(currentWord);
            }
			
            scan.close();
            
		} catch (FileNotFoundException e) {
			return("File not found");
		}
		
		int count = 0;
		
		for (String currentWord : list) {
			//if the word is parsable  to Int or Double
			if(isStringInt(currentWord) || isStringDouble(currentWord)){
				//add the parsable string and the string before and after
				//(if at the begining or end of array, then print null, to avoid out of index error)
				sb.append((count-1 < 0 ? "null" : list.get(count-1)) + " " + currentWord + " " + ((count+1) > (list.size() - 1) ? "null" : list.get(count+1)) + "\n");
			}
			count++;
		}
		return sb.toString();
	}
	
	/**
	 * Method which validates if a String is an Int
	 * @param word
	 * @return boolean, stating if a String is a Int or not
	 */
	private boolean isStringInt(String word) {
		
		boolean flag = true;
		try {
			Integer.parseInt(word);
		} catch (NumberFormatException e) {
			flag = false;
		}
		return flag;
	}
	
	/**
	 * Method which validates if a String is a Double
	 * @param word
	 * @return boolean, stating if a String is a double or not
	 */
	private boolean isStringDouble(String word){
		
		boolean flag = true;
		try {
			Double.parseDouble(word);
		} catch (NumberFormatException e) {
			flag = false;
		}
		return flag;
	}
}
