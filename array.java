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
<-------------------------------plus one------------------------------------->
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
<--------------------------answer------------------------------>
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
         int[] result = new int[digits.length + 1];
         result[0] = 1;
         return result;
    }
}
    
<-----------------remove duplicates in sorted array-------------------------------->
//removing numbers which are repeated and return thr number of unique elements--->replacind method
<----------------------------------answer----------------------->
    class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
//eg:nums=[1,1,2]
1>>//i=0;-->nums[i]=1
   //j=1;-->nums[j]=1
   //nums[i]!=nums[j]---->false
2>>//i=0;-->nums[i]=1;
   //j=2;-->nums[j]=2;
   //nums[i]!=nums[j]---->true
   //i++;---->i=1;nums[i]=1
   //replacing nums[i] i.e., 1 with nums[j] i.e., 2
3>>//returning i+1 ie.,2;
<-----------------------------------Fizz Buzz---------------------------------->
    class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                res.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                res.add("Fizz");
            }
            else if(i%5==0)
            {
                res.add("Buzz");
            }
            else
            {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
<-----------------------------------------count primes-------------------------------------------------->
import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2){
         return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
//it starts checking from 2, i considers all the multiples of as not prime.in the same
//way it checks for numbers less  than root of i. Bcz after the root of given number the divisors repeat.
//eg: for n=12--->root of 12=3.4
    //multiples of 12--->2*6, 3*4, 4*3, 6*2
    //-->here after 3 the divivsors repeat.
    //so its enough to check until the root of given number
    //in 2*6 --> for 2 one loop(i)
    //       --> for 6 one loop(j), where it starts checks from 2*2, 2*4, 2*6, 2*8 [bcz, j=j+i -- j=j+2]
<-----------------------------------number of centered subarrays---------------------------------------->

import java.util.HashMap;
class Solution {
    public int centeredSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                for(int k=i;k<=j;k++){
                    if(nums[k]==sum){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
//Input: nums = [-1,1,0]
//Output: 5
//Explanation:
//->All single-element subarrays ([-1], [1], [0]) are centered.
//->The subarray [1, 0] has a sum of 1, which is present in the subarray.
//->The subarray [-1, 1, 0] has a sum of 0, which is present in the subarray.
//->Thus, the answer is 5.

<--------------------------------kids with greatest number of candies------------------------------------>
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true] 
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
<-----------------------------------answer------------------------------------>
    class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kwc=new ArrayList<>();
        int max=candies[0];
        for (int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
         for (int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                kwc.add(true);
            }
            else{
                kwc.add(false);
            }
        }
        return kwc;
    }
}
<-------------------------------------remove element------------------------------------>
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
//The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
<----------------------------------shuffle the array--------------------------------------------->
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];      // xi
            result[index++] = nums[i + n];  // yi
        }

        return result;
    }
}
<---------------------------running sum of 1-D array------------------------------------------->
    class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}

<-------------------build an array from permutation------------------------------------>
    class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
