class reverseVowel {
    
    public String reverseVowels(String s) {
    	
    	int a = 0;
    	
    	
        char[] v = s.toCharArray();
       ArrayList<Character> found = new ArrayList<Character>();
        
       
        for (int i = 0; i < s.length(); i++) {
        	
        	if (v[i] == 'a' || v[i] == 'e' || v[i] == 'i' || v[i] == 'o' || v[i] == 'u'
                || v[i] == 'A' || v[i] == 'E' || v[i] == 'I' || v[i] == 'O' || v[i] == 'U'
            ) {
        		found.add(v[i]);
        	}
        	
        }
        
       for (int j = s.length() - 1; j >= 0; j--) {
        	
        	
        	if (v[j] == 'a' || v[j] == 'e' || v[j] == 'i' || v[j] == 'o' || v[j] == 'u'
                || v[j] == 'A' || v[j] == 'E' || v[j] == 'I' || v[j] == 'O' || v[j] == 'U'
            ) {
        		v[j] = found.get(a);
                a++;
        	}
    
        	
        }

        return new String(v);

    }

}

// Super easy!
