//<--------------------------reverse words in a string 3------------------>
class Solution {
    public String reverseWords(String s) {
    String words[]=s.split(" ");
    StringBuilder res=new StringBuilder();
    // String res="";
    for(int i=0;i<words.length;i++)
    {
        String word=words[i];
        for(int j=word.length()-1;j>=0;j--)
        {
        //    res+=word.charAt(j);
              res.append(word.charAt(j));
        }
         if(i<words.length-1)
         {
            //  res+=" ";
            res.append(" ");
         }
    }
    //return res;
    return res.toString();
    }    
}
//when we use String, every time we add a new object is created is created which eats up the memory.This slows down the execution.---->not efficient
//in case of String, we have to rewrite everytime bcz it cannot be erased
//when Stringbuilder is used, it adds one by one to the same object(without creating a new object),this executes faster and uses less memory.------->efficient
//in case of StringBuilder, no need of rewriting



//<------------------------------reversing vowels in a string----------->
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
           
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

           
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


//<-------------reverse a string------->
 class Solution {
     public void reverseString(char[] s) {
         int left = 0;
         int right = s.length - 1;

         while (left < right) {
             char temp = s[left];
             s[left] = s[right];
             s[right] = temp;

             left++;
             right--;
         }
     }
 }



//<------------3330.find the original typed string------>
 class Solution {
     public int possibleStringCount(String word) {
      
         int n=1;
         for(int i=0;i<word.length()-1;i++){
        
             if( word.charAt(i) == word.charAt(i+1) ){
                 System.out.println(i);
                 n++;
      
         
           
             }
     }
     return n;
         }
 }

//<--------------------125.valid palindrome--------------------->
class Solution {
    public boolean isPalindrome(String s) {
       
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}

//<------------------58.length of last word---------------------->
class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int count=0;
        while(n>=0 && s.charAt(n)==' '){
            n--;
        }
        while(n>=0 && s.charAt(n)!=' '){
            count++;
            n--;
        }
        return count;

    }
}
  
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



