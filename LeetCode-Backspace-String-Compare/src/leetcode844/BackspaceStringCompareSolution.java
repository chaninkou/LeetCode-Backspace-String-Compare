package leetcode844;

public class BackspaceStringCompareSolution {
    public boolean backspaceCompare(String S, String T) {
		int i = S.length() - 1;

		int j = T.length() - 1;

		while (true) {
			// Delete whenever there is # in the string, and update index after
			for (int backspaceCount = 0; i >= 0 && (backspaceCount > 0 || S.charAt(i) == '#'); i--) {
				// Increase the amount of backspace by 1 if current is #
				if (S.charAt(i) == '#') {
					backspaceCount += 1;
				} else { // else, decrease the amount of backspace
					backspaceCount -= 1;
				}
			}

			// Delete whenever there is # in the string, and update index after
			for (int backspaceCount = 0; j >= 0 && (backspaceCount > 0 || T.charAt(j) == '#'); j--) {
				// Increase the amount of backspace by 1 if current is #
				if (T.charAt(j) == '#') {
					backspaceCount += 1;
				} else { // else, decrease the amount of backspace
					backspaceCount -= 1;
				}
			}

			// After deleting due to #, if not same, break out of loop
			if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
				i--;
				j--;
			} else {
				break;
			}
		}
        return i == -1 && j == -1;
	}
}
