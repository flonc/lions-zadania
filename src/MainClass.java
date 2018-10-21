
public class MainClass {

	public static void main(String[] args) {
	
		MainClass m = new MainClass();
		String words[] = {"a","bb","b","ccc"};
		int len = 1;
		System.out.println(m.wordsCount(words, len));
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

}
