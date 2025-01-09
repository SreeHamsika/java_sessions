public class day_7 {
        //contains duplicate
        //[1,5,3,6,7] false
        //[1,5,6,4,4] true
        //true if contains
        //false orelse
        public boolean containsDuplicate(int[] nums) {
            for(int i = 0; i < nums.length;i++){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
    }


