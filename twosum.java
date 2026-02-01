class twosum {
    public int[] twoSum(int[] nums, int target) {
        
         HashMap<Integer, Integer> help = new HashMap<>();   // Param 1 is location, param 2 is value.
int[] pair = null; 

        for (int i = 0; i < nums.length; i++){
            int compliment = target - nums[i]; // This finds the number needed to satisfy the sum
        
            if (help.containsKey(compliment)){ // Initially this will be null, so first case will hit else statement
               pair = new int[] {help.get(compliment), i}; // If a match is found aka compliment, it will return the new int[] by breaking the loop and hit the return pair command.
                break; // Save run-time.
            } else
              help.put(nums[i], i); // Adds to the "catalogue". 
        }

        return pair; // Returns our pair of numbers location that will sum to target
        }


}
    
