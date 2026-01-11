<-------------------------palindrome number------------------------------------>
class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rev=0,rem;
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==num)
        {
            return true;
        }
        return false;
    }
}
<---------------------------power of two------------------------------------------>
//Given an integer n, return true if it is a power of two. Otherwise, return false.Given an integer n, return true if it is a power of two. 
//otherwise, return false.
bool isPowerOfTwo(int num) {
    if(num<=0)
    return false;
  bool flag=true;
   
   for(;num>1;num=num/2)
   {
      if(num%2==1)
      {
         flag=false;
         return flag;
      }
     
   }
   return flag;
}
<<<<<<<<<<<<<<<<<<<<<<<<or>>>>>>>>>>>>>>>>>>>>>>>>>>>
bool isPowerOfTwo(int num) {
    if(num<=0)
    return false;
    return(n & (n-1))==0;
 }
//10 = 1010
//9  = 1001
//10 & 9 = 1000 ≠ 0 → false
A power of two has only one 1 bit in its binary form.

//8   = 1000
//7   = 0111
//8 & 7 = 0000   → true

