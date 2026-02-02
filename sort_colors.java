class sort_colors {
    public void sortColors(int[] nums) {
    int i = 0;
    int temp;
    boolean clean = false;
        while (!clean && i < nums.length - 1){

            if (nums[i] > nums[i + 1]){
               temp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = temp;
                i = 0;
                } 
                i++;
            }
        }
    }
