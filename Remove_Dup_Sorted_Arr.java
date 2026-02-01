class Remove_Dup_Sorted_Arr {
    public int removeDuplicates(int[] nums) {
        int k = 0; // How many duplicates are found. 

            for (int i = 0; i < nums.length; i++){
                if (i + 1 < nums.length && nums[i] == nums[i+1]){ 
                // If case handles any potential out-of-bound exceptions by checking if i + 1 (next element) exists in the array.
                continue; // If a match is found, we just skip it. 
                } else {
                nums[k++] = nums[i]; // We are also going to increment the index position of the int[] after we store the unique element at the index's
                // current pointer.
            }    
        }
        return k; // Finally, we're going to return the new size of the array for the test-case to try. 
    }
}
