package utilities;

// works consulted: Michelle Ferreirae
// - my whiteboard contained significantly much more logic than needed, thus I consulted Michelle's solution and implemented it similarly for my code

import java.util.HashMap;
import java.util.LinkedList;

public class MultiBracketValidation {
    // instantiate hashmap of bracket matches
    private static HashMap<Character, Character> bracketMatches;
    static {
        bracketMatches = new HashMap<>();
        bracketMatches.put('[', ']');
        bracketMatches.put('(', ')');
        bracketMatches.put('{', '}');
    }

    public static boolean checkValidBrackets(String stringToParse) {
        // instantiate stack of future brackets
        LinkedList<Character> bracketStack = new LinkedList<>();

        // iterating over string
        for (int i = 0; i < stringToParse.length(); i++) {
            char currentChar = stringToParse.charAt(i);

            // if current char is opening bracket, push to stack
            if (bracketMatches.containsKey(currentChar)) {
                bracketStack.push(currentChar);

                // else if closing bracket and if stack is empty, return false because it wasn't matched
            } else if (bracketMatches.containsValue(currentChar)) {
                if (bracketStack.isEmpty()) {
                    return false;
                }

                // pop stack and check if that char corresponds to its closing bracket, if not return false
                char openedBracket = bracketStack.pop();
                if (currentChar != bracketMatches.get(openedBracket)) {
                    return false;
                }
            }
        }
        // return true if stack emptied, false if not
        return bracketStack.isEmpty();
    }
}
