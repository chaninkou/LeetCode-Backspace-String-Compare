package backspaceString;

public class BackspaceStringCompareSolution {
	public boolean backspaceCompare(String S, String T) {
		// Total index of String S
		int i = S.length() - 1;

		// Total index of String T
		int j = T.length() - 1;

		// When it doesn't return anything, compare again
		while (true) {
			// Checking for # in last element of String S, and then continue the
			// loop
			for (int backspaceCount = 0; i >= 0 && (backspaceCount > 0 || S.charAt(i) == '#'); i--) {
				// Increase the amount of backspace by 1 if current is #
				if (S.charAt(i) == '#') {
					backspaceCount += 1;
				} else { // else, decrease the amount of backspace
					backspaceCount -= 1;
				}
			}

			// Checking for # in last element of String T, and then continue the
			// loop
			for (int backspaceCount = 0; j >= 0 && (backspaceCount > 0 || T.charAt(j) == '#'); j--) {
				// Increase the amount of backspace by 1 if current is #
				if (T.charAt(j) == '#') {
					backspaceCount += 1;
				} else { // else, decrease the amount of backspace
					backspaceCount -= 1;
				}
			}

			// Checking if the last element is the same when i and j is both
			// positive
			if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
				i--;
				j--;
			} else {
				// Return true or false depend if they are still at the same
				// index or not
				return i == j;
			}

		}
	}
}
