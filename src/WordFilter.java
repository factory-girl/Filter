import java.util.ArrayList;
import java.util.Scanner;


public class WordFilter {
	public static void main(String args[]) {
		Filter StringFilter = new ShortWordFilter();
		System.out.println("Please enter a list of words to filter, separated by spaces.");
		Scanner in = new Scanner(System.in);
		String words = in.nextLine();
		String[] wordSplit = words.split(" ");
		ArrayList<Object> wordList = new ArrayList<Object>();
		ArrayList<Object> wordArrayList = new ArrayList<Object>();
			for (String a : wordSplit) {
				wordList.add(a);
			}
		wordArrayList.addAll(collectAll(wordList, StringFilter));
		System.out.println(wordArrayList);
	}
	
	public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f) {
		ArrayList<Object> listSort = new ArrayList<Object>();
		for (Object obj : objects) {
			if (f.accept(obj) == true) {
				listSort.add(obj);
			}
		}
		return listSort;
	}
}
