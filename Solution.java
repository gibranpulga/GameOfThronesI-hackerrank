import java.io.*;
import java.util.*;

public class Solution {
	public String check (String string1) {
		char[] string1Letters = string1.toLowerCase().toCharArray();
		int[] alphabetLetters = new int[26];
		for (int i=0; i<string1Letters.length; i++) {
			alphabetLetters[string1Letters[i] - 'a']++;
		}
		int unevenNumbers = 0;
		for (int i=0; i<alphabetLetters.length; i++) {
			if (alphabetLetters[i] % 2 > 0) {
				unevenNumbers++;
				if (unevenNumbers > 1) {
					return "NO";
				}
			}
		}
		return "YES";
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution s = new Solution ();
        Scanner in = new Scanner(System.in);
                while (in.hasNextLine()) {
            String string1 = in.next();
            System.out.println(s.check(string1));
        }
		in.close();
    }
}
