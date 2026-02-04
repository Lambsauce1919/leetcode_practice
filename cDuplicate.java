class cDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> contains = new HashSet<>();

        for (int i: nums){ // Iterate through the int array. 
                if(contains.contains(i)){ // If this result already exists in the HashSet, that means there's a duplicate and we can terminate early.
                    return true;
                } else { // However, if it does- we need to add it so if it comes up again later we can do the if condition.
                    contains.add(i);
                }

        }
    return false; // If no duplicates are found we return false as requested.
    }
}
