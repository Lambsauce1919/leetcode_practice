class selfDivision {
 public List<Integer> selfDividingNumbers(int left, int right) {
	        
          List<Integer> accepted = new ArrayList<>();
        
          for (int i = left; i <= right; i++){ // i holds the entire number
        	  		
        	 char[] scan = String.valueOf(i).toCharArray(); // Convert the current number into a character array. 
        	     boolean isValid = true;	
        	 	for (char c : scan) { // Iterate through the digits found in this number
        	 		
                    int temp = c - '0';
        	 		
        	 		if (temp == 0) { // If it's zero it fails the check
        	 		    isValid = false;
        	 			break;
        	 		
        	 		} else if (i % temp == 0) { // Time to check the remainder, if it's not equal to zero, it's disqualified.
        	 			continue; // Stop and continue scanning.
        	 			
        	 		} else if (i % temp != 0) {
                         isValid = false;

        	 			break; // Number fails the self-dividing test
        	 			
        	 		}
        	 	} // End of number check
                if (isValid){ // If the number is valid, it will be added.
                accepted.add(i); // This will trigger if it's a qualified number
                }
          }
          return accepted; // Return the new list of accepted values.
  }
}
