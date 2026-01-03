//<----------------------Count Indices to Balance Even and Odd Sums-------------------->
class Solution {
    public int cntWays(int[] arr) {
        // code here
        // ArrayList<Integer> indi = new ArrayList<Integer>();
        int count=0;
        int pos=0;
         int n=arr.length;
        for(int i=0;i<n;i++){
            int sume=0;
            int sumo=0;
           
        for(int j=0;j<n;j++){
            
            if(i==j){
                continue;
            }
            if(pos%2==0){
                sume=sume+arr[j];
            }
            else{
                sumo=sumo+arr[j];
            }
            pos++;
        }
        
            if(sume==sumo){
                count++;
            }
        
    }
        return count;
    }
}

//<-------------------------------best time to buy and sell a stock---------------------------->
class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];  // cheapest price so far
        int bigg = 0;         // max profit so far

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buy) {
                buy = prices[i];   // cheaper buying day
            } else {
                int profit = prices[i] - buy;
                if (profit > bigg) {
                    bigg = profit; // better profit
                }
            }
        }
        return bigg;
    }
}
//Walk day by day (SLOW)
//Day 1 → price = 7(No previous day).
//-->Buy here
//buy = 7
// bigg = 0

// Day 2 → price = 1
// Ask:Is 1 cheaper than 7?
// YES, So:buy = 1   // better day to buy

// Day 3 → price = 5
// Ask:If I sell today, profit?
// profit = 5 - 1 = 4
// Is this better than before?---->4 > 0 → YES
// So:bigg = 4

// Day 4 → price = 3
// profit = 3 - 1 = 2
// Is 2 better than 4?-->NO → ignore

// Day 5 → price = 6
// profit = 6 - 1 = 5--->Is 5 better than 4?
// YES, bigg = 5

// Day 6 → price = 4
// profit = 4 - 1 = 3
// Is 3 better than 5?-->NO → ignore

// Step 5: Final Answer
// bigg = 5

// Buy at 1, sell at 6.

<----------------------------------fnding second largest element-------------------------------------->
    //Given an array of positive integers arr[], return the second largest element from the array.
    //If the second largest element doesn't exist then return -1.
    //Note: The second largest element should not be equal to the largest element.

Note: The second largest element should not be equal to the largest element.
class Solution {
    public int getSecondLargest(int[] arr) {
        int big=0;
        int flag=0;
       int n=arr.length;
        Arrays.sort(arr);
         for(int i=n-2;i>=0;i--)
         {
           if(arr[i]!=arr[n-1])
           {
               return arr[i];
           }
         }
         
        
       return -1;
    }
}

<----------------------------------------move zeroes---------------------------------------------------->
    class Solution {
    public void moveZeroes(int[] nums) {
        //sorting method
        for(int i=0;i<nums.length-1;i++)  
         {
             for(int j=0;j<nums.length-1;j++)
             {
                 if(nums[j]==0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                 }
            }
                  
         }  
  }
}
 class Solution {
    public void moveZeroes(int[] nums) {
        //All non-zero values are packed at the front
        //Values after index pos are garbage and don’t matter

        int pos = 0;
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }

        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
}
Initial State:
nums = [0, 1, 0, 3, 12]
pos = 0

First for Loop (Copy Non-Zero Elements Forward)
i = 0
nums[0] = 0 → condition false---->No change.
nums = [0, 1, 0, 3, 12]
pos = 0

i = 1
nums[1] = 1 → non-zero
nums[pos] = nums[1]
nums[0] = 1
pos++
nums = [1, 1, 0, 3, 12]
pos = 1

i = 2
nums[2] = 0 → skip
nums = [1, 1, 0, 3, 12]
pos = 1

i = 3
nums[3] = 3 → non-zero
nums[1] = 3
pos++
nums = [1, 3, 0, 3, 12]
pos = 2

i = 4
nums[4] = 12 → non-zero
nums[2] = 12
pos++
nums = [1, 3, 12, 3, 12]
pos = 3
End of for Loop

nums = [1, 3, 12, ?, ?]
pos = 3

Second while Loop (Fill Remaining with Zeros)
pos = 3
nums[3] = 0
pos++
nums = [1, 3, 12, 0, 12]
pos = 4

pos = 4
nums[4] = 0
pos++
nums = [1, 3, 12, 0, 0]
pos = 5

Exit Loop (pos == nums.length)
Final Output
[1, 3, 12, 0, 0]

<----------------------two sum------------------------------------------>
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
<----------------------------answer---------------------------->
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
           
            if(nums[i]+nums[j]==target)
            {
                return new int[]{i, j};
            }
            }
        }
        return new int[]{};
    }
}
