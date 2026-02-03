class firstUnique {


    public int firstUniqChar(String s) {

        HashMap<Character, Integer> uniqueCount = new HashMap<>();
        // Loops through the array first and document every character that you encounter.

        for (int i = 0; i < s.length(); i++){

            if (!uniqueCount.containsKey(s.charAt(i))){
                 uniqueCount.put(s.charAt(i), 1);
            } else {
             uniqueCount.put(s.charAt(i), uniqueCount.get(s.charAt(i)) + 1);
            }

        }

         for (int j = 0; j < s.length(); j++){

                if (uniqueCount.get(s.charAt(j)) == 1){
                    return j;
                }

        }

        return -1;


    }


}

// I'm going to be quite honest, this one took me a bit longer to figure out than it should have. 
// The reason? I was trying to do everything in o(N) rather than o(2n)
