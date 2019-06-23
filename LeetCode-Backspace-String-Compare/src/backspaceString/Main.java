package backspaceString;

public class Main {
	public static void main(String[] args){
		String S = "a##b#c";
		String T = "a#b#c";
		
		System.out.println("String S: " + S + " String T: " + T);
		
		BackspaceStringCompareSolution solution = new BackspaceStringCompareSolution();
		
		System.out.println("solution: " + solution.backspaceCompare(S, T));
	}
}
