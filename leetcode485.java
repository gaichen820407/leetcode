public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
		// more faster way
		// when value equals 1, plus 1 to temp variable
		// this method will update final result ,and reset the temp variable when value equals 0
		// omit the last step in naive way to reduce time complexity
        int maxSum=0;
        int curSum=0;
        for(int i=0;i<nums.length+1; i++){
            if(i<nums.length&&nums[i]==1){curSum++;}
            else{ maxSum = Math.max(curSum,maxSum);
                  curSum = 0;}
        }
        return maxSum;
		
		// naive way
		// the core is check every value in the array, and if the value equals 1, then plus 1 to the temp variable
		// if the value equals 0, then compare the final result and the temp variable to test which is the bigger one,
		// last is compare temp variable and final result to avoid last value is 1 but can't assign temp variable's value to the result
		
        // int tempR=0;
        // int result=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         tempR++;
        //     }
        //     else{
        //         if(tempR>result){
        //             result=tempR;
        //         }
        //         tempR=0;
        //     }
        // }
        // result=(tempR>result)?tempR:result;
        // return result;
    }
}
