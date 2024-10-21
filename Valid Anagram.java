// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 
// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        
        for(int i=0;i<s.length(); i++){
            if(h1.containsKey(s.charAt(i))){
                h1.put(s.charAt(i), h1.get(s.charAt(i)) +1);
            }
            else{
                h1.put(s.charAt(i), 1);
            }
        }
        
        for(int i=0;i<t.length(); i++){
            
            if(h2.containsKey(t.charAt(i))){
                h2.put(t.charAt(i), h2.get(t.charAt(i)) +1);
            }
            else{
                h2.put(t.charAt(i), 1);
            }
        }
        
       return h1.equals(h2);
    }
}