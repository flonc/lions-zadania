
public class MainClass {

	public static void main(String[] args) {
		// Zadanie nr 1
		MainClass m = new MainClass();
		String wordsZad1[] = { "a", "bb", "b", "ccc" };
		int len = 1;
		System.out.println("Count of the number of strings with the given length: " + m.wordsCount(wordsZad1, len));

		// Zadanie nr 2
		String wordsZad2[] = { "a", "b", "c", "d" };
		int n = 2;
		m.printNewArray(m.wordsFront(wordsZad2, n));
		
		// Zadanie nr3
		System.out.println("Lottery result: " + m.greenTicket(1, 2, 3));

	}

	// Metoda do zadania nr1
	public int wordsCount(String[] words, int len) {

		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				count++;
			}
		}

		return count;

	}

	// Metoda do zadania nr2
	public String[] wordsFront(String[] words, int n) {

		String newArray[] = new String[n];

		for (int i = 0; i < n; i++) {

			newArray[i] = words[i];
		}

		return newArray;

	}

	// Metoda pomocnicza do wyswietlenia zadania nr2
	public void printNewArray(String[] array) {
		System.out.println("New array containing the first N strings: ");
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	// Metoda do zadania nr 3
	public int greenTicket(int a, int b, int c) {
		int result = 0;
		if (a == b && a == c)
			return result = 20;
		if (a == b)
			return result = 10;
		if (a == c)
			return result = 10;
		if (b == c)
			return result = 10;
		return result;
	}

}
