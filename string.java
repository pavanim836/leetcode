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
        
  
