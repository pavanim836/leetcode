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
<-----------------------------------largest even number------------------------------------------>
class Solution {
    public String largestEven(String s) {
        int even=-1;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==0){
                even=i;
            }
        }
        if(even==-1){
            return "";
        }
        return s.substring(0,even+1);
    }
}
//You are given a string s consisting only of the characters '1' and '2'.
class Solution {
    public String largestEven(String s) {
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                return s.substring(0,i+1);
            }
        }
       
            return "";
       
    }
}
<-----------------------------count residue prefixes-------------------------------->
    class Solution {
    public int residuePrefixes(String s) {
   
        int count=0;
        for(int i=1;i<=s.length();i++){
            String prefix=s.substring(0,i);
            boolean seen[]=new boolean[26];
             int distinct=0;
            for(int j=0;j<prefix.length();j++){
                    char c=prefix.charAt(j);
                    if(!seen[c-'a']){
                        seen[c-'a']=true;
                        distinct++;
                    }
            }
           int length=prefix.length();
            if(distinct==length%3){
                count++;
            }
        }
        return count;
    }
}
//Input: s = "abc"
//Output: 2
//Explanation:​​​​​​​
//->Prefix "a" has 1 distinct character and length modulo 3 is 1, so it is a residue.
//->Prefix "ab" has 2 distinct characters and length modulo 3 is 2, so it is a residue.
//->Prefix "abc" does not satisfy the condition. Thus, the answer is 2.©leetcode

<----------------------------roman to integer------------------------------------>
    class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = value(s.charAt(i));

            // if next symbol exists and is bigger, subtract
            if (i + 1 < s.length() && curr < value(s.charAt(i + 1))) {
                total -= curr;
            } else {
                total += curr;
            }
        }

        return total;
    }

    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
}

<------------------------finding number with even number of digits-------------------------->
    class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}

<-----------------------------Check If N and Its Double Exist---------------------------------------->
    import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            if (set.contains(2 * n) || (n % 2 == 0 && set.contains(n / 2))) {
                return true;
            }
            set.add(n);
        }

        return false;
    }
}

<------------------------------reverse string 2---------------------------------->
    class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}


<--------------------------find occurence of first index of a string--------------------------->
    class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}


<--------------------------------------add binary--------------------------------------------->
    class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        return result.reverse().toString();
    }
}




