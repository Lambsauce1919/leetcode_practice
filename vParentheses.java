class Solution {


    public boolean isValid(String s) {
        
Stack<Character> stack = new Stack<>();

for(char c: s.toCharArray()){

if(c == '[' || c == '(' || c == '{'){ // If the current character is an opening bracket 
    stack.push(c);
} else {

if (stack.isEmpty()) return false; // If nothing has been added yet, do not attempt to check...

char top = stack.pop(); // Check the most recent opening bracket.

if ((c == ']') && (top != '[')){  // These conditions check if the current ending bracked doesnt equal the most recent opening bracket to return false.
    return false;
} else if ((c == '}') && (top != '{')){
    return false;
} else if ((c == ')') && (top != '(')){
    return false;
}

}

}

return stack.isEmpty();
    }



}
