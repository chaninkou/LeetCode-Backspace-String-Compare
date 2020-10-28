package leetcode844;

public class Main {
	public static void main(String[] args){
		String S = "a#a#bc";
		String T = "a#bc";
		
		System.out.println("String S: " + S + " String T: " + T);
		
		BackspaceStringCompareSolution solution = new BackspaceStringCompareSolution();
		
		System.out.println("solution: " + solution.backspaceCompare(S, T));
	}
}
