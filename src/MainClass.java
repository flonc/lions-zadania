
public class MainClass {

	public static void main(String[] args) {
	
		MainClass m = new MainClass();
		String wordsZad1[] = {"a","bb","b","ccc"};
		int len = 1;
		System.out.println("Count of the number of strings with the given length: " + m.wordsCount(wordsZad1, len));
		
		String wordsZad2[] = {"a","b","c","d"};
		int n = 2;
		if(n <= wordsZad2.length) {
			m.printNewArray(m.wordsFront(wordsZad2, n));
		}else {
			System.out.println("N is bigger than array length!");
		}
		
	}
	
	public int wordsCount(String[] words, int len) {
		
		int count = 0;
		for (int i=0; i<words.length; i++) {
			if (words[i].length() == len) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public String[] wordsFront(String[] words, int n) {
		
		
		
		String newArray[] = new String[n];
		
		for(int i=0; i<n; i++) {
			
			newArray[i] = words[i];
		}
		
		return newArray;
		
	}
	
	public void printNewArray(String[] array) {
		System.out.println("New array containing the first N strings: ");
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}

}
