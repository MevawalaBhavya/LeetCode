/* 
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/

class Solution {
    public boolean isPalindrome(String s) {
//         String str = s.replaceAll("[^a-zA-Z0-9]", "")
//                  .replaceAll("\\s+", "").toLowerCase();
//         String str1 = "";
//         System.out.println(str);
    
//         if(str.length() <=1){
//             return true;
//         }else{
//             for(int i=str.length()-1;i>=0;i--){
//                 str1 += str.charAt(i);
//             }
//         }
            
//         return str.equals(str1);
        
        s = s.toLowerCase();
        
        int l = 0, r = s.length()-1;
        
        while(l<r){
            
            if(!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else if ( s.charAt(r) != s.charAt(l))
                return false;
            else{
                r--;
                l++;
            }
        }
        
        return true;
        
    }
}