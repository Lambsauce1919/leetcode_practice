class remDupeAdj {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char currentChar : s.toCharArray()) {
            // If the StringBuilder is not empty and the last character is the same as the current one
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == currentChar) {
                sb.deleteCharAt(sb.length() - 1); // Remove the last character
            } else {
                sb.append(currentChar); // Add the current character
            }
        }

        return sb.toString();
    }
}
