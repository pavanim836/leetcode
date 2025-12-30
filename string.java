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
//You are given a string word, which represents the final output displayed on Alice's screen.
//Return the total number of possible original strings that Alice might have intended to type.
//-->Example 1:
Input: word = "abbcccc"
Output: 5
//-->Explanation:
The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".
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
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
//it reads the same forward and backward. Alphanumeric characters include letters and numbers.
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
//replaceAll("[^a-zA-Z0-9]", "")
//-->[^ ] → means NOT
//--->a-zA-Z0-9 → letters and digits
//-->Removes spaces, commas, symbols, punctuation

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

<----------------------------first unique character in a string-------------------------------------------->
//We use a HashMap when we need to store data as key–value pairs and retrieve or update it quickly.

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer>map=new HashMap<>();  //HashMap called map is created
        for(char c:s.toCharArray()){    //given string is converted into character array and stored in variable c----{'l','e','e','t','c','o','d','e'}.each of its frequency is set to 0
            map.put(c,map.getOrDefault(c,0)+1);     //iteration begins,in the array c if the char is already present then get its frequency or if not present get default value(0). then increment by 1
        }      
        for(int i=0;i<s.length();i++) //checks for first character having freq=1
        {
            if(map.get(s.charAt(i))==1)  //if the frequency of the char is 1 then returns its index
                return i;
        }
  return -1;
    }
}
//Given a string:"leetcode"
l → how many times?
e → how many times?
t → how many times?
So the natural structure is: character → frequency
This is a key → value relationship.




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




