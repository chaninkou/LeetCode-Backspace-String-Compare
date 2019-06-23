package backspaceString;

public class BackspaceStringCompareSolution {
	 public boolean backspaceCompare(String S, String T) {
	        int i = S.length() - 1;
	        
	        int j = T.length() - 1;
	        
	        while(true){
	        	// The if statement check if the last element of S and T is the same, if it's just go to the left
	            if(i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)){
	                i--;
	                j--;
	                System.out.println("i : " + i);
	                System.out.println("j : " + j);
	            }else{
	                return i == j;
	            }
	        	
	            // String S
	            for(int back = 0; i >= 0 && (back > 0 || S.charAt(i) == '#'); i--){
	                if(S.charAt(i) == '#'){
	                    back += 1;
	                }else{
	                    back += -1;
	                }
	                System.out.println("back i : " + back);
	            }
	            
	            // String T
	            for(int back = 0; j >= 0 && (back > 0 || T.charAt(j) == '#'); j--){
	                if(T.charAt(j) == '#'){
	                    back += 1;
	                }else{
	                    back += -1;
	                }
	                System.out.println("back j : " + back);
	            }
	        }
	    }	
}
