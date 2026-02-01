class valid_palindrome {
    public boolean isPalindrome(String s) {

    // Step 1, remove all uppercase characters. 

    // Step 2. Remove all non-alphabetical characters.

    s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // First it translates everything to lowercase, after which it will remove all non-alphabetical characters.

    if (new StringBuilder(s).reverse().toString().equalsIgnoreCase(s)){
        return true; // Return if is IS a palindrome. 
    }

    return false; // Return this if it's NOT a palindrome. 

    }
}

// Runtime = 15 ms according to LeetCode.

// Doesn't make sense because given my estimates:

// ~0.01 to 0.05 ms	Creating 3+ objects and running regex overhead. (~1k character input)
