import java.util.*;

class Program {
  public static boolean balancedBrackets(String str) {
    // Write your code here.
		String openBracket = "({[";
		String closeBracket = ")}]";
		List<Character> stack = new ArrayList<Character>();
		Map<Character, Character> matchingBracket = new HashMap<Character, Character>();
		matchingBracket.put(')', '(' );
		matchingBracket.put('}', '{');
		matchingBracket.put(']', '[');
		
		for(int i = 0; i < str.length(); i++){
			char letter = str.charAt(i);
			if(openBracket.indexOf(letter) != -1){
				stack.add(letter);
			}
			else if (closeBracket.indexOf(letter) != -1){
				if(stack.size() ==0){
					return false;
				}
				if (stack.get(stack.size()-1) == matchingBracket.get(letter)){
					stack.remove(stack.size()-1);
				}
				else{
					return false;
				}
			}
		}
		
    return stack.size()== 0;
  }
}
