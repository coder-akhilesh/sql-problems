class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length-1;
    
    while(white<=blue){
        if(nums[white]==0){
            swap(nums,red,white);
            red++;
            white++;
        }
        else if(nums[white]==1){
            white++;
        }
        
        else {
            swap(nums,blue,white);
            blue--;

        }
    }
        }
        public void swap(int [] nums, int i,int j){
            int k = nums[i];
            nums[i]=nums[j];
            nums[j]=k;

        }
        }
    